package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.AdminUser;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.AdminUserRepository;
import com.ms.sharedentityv1.utility.UtilityMethods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class AdminUserDao {
	@Autowired
	AdminUserRepository adminUserRepository;
	@PersistenceContext
	EntityManager entityManager;

	public AdminUser save(AdminUser adminUser) {
		return adminUserRepository.save(adminUser);
	}

	public List<AdminUser> save(List<AdminUser> adminUsers) {
		return adminUserRepository.saveAll(adminUsers);
	}

	public EntryItem<AdminUser> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																Integer pageNumber, Integer pageSize) {
		List<AdminUser> adminUsers;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<AdminUser> cq = cb.createQuery(AdminUser.class);
		Root<AdminUser> adminUserRoot = cq.from(AdminUser.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(AdminUser.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, adminUserRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, adminUserRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<AdminUser> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		adminUsers = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, adminUsers);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<AdminUser> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public AdminUser findById(Long id) {
		return adminUserRepository.findById(id).orElse(null);
	}
}
