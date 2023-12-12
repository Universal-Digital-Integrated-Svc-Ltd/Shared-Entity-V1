package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.SellerShipping;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.SellerShippingRepository;
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
public class SellerShippingDao {
	@Autowired
	SellerShippingRepository sellerShippingRepository;
	@PersistenceContext
	EntityManager entityManager;

	public SellerShipping save(SellerShipping sellerShipping) {
		return sellerShippingRepository.save(sellerShipping);
	}

	public List<SellerShipping> save(List<SellerShipping> sellerShippings) {
		return sellerShippingRepository.saveAll(sellerShippings);
	}

	public EntryItem<SellerShipping> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																Integer pageNumber, Integer pageSize) {
		List<SellerShipping> sellerShippings;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<SellerShipping> cq = cb.createQuery(SellerShipping.class);
		Root<SellerShipping> sellerShippingRoot = cq.from(SellerShipping.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(SellerShipping.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, sellerShippingRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, sellerShippingRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<SellerShipping> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		sellerShippings = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, sellerShippings);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<SellerShipping> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public SellerShipping findById(Long id) {
		return sellerShippingRepository.findById(id).orElse(null);
	}
}
