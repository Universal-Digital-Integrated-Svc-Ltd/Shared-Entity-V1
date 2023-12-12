package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.PincodeMaster;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.PincodeMasterRepository;
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
public class PincodeMasterDao {
	@Autowired
	PincodeMasterRepository pincodeMasterRepository;
	@PersistenceContext
	EntityManager entityManager;

	public PincodeMaster save(PincodeMaster pincodeMaster) {
		return pincodeMasterRepository.save(pincodeMaster);
	}

	public List<PincodeMaster> save(List<PincodeMaster> pincodeMasters) {
		return pincodeMasterRepository.saveAll(pincodeMasters);
	}

	public EntryItem<PincodeMaster> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																Integer pageNumber, Integer pageSize) {
		List<PincodeMaster> pincodeMasters;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<PincodeMaster> cq = cb.createQuery(PincodeMaster.class);
		Root<PincodeMaster> pincodeMasterRoot = cq.from(PincodeMaster.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(PincodeMaster.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, pincodeMasterRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, pincodeMasterRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<PincodeMaster> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		pincodeMasters = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, pincodeMasters);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<PincodeMaster> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public PincodeMaster findById(Long id) {
		return pincodeMasterRepository.findById(id).orElse(null);
	}
}
