package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.State;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.StateRepository;
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
public class StateDao {
	@Autowired
	StateRepository stateRepository;
	@PersistenceContext
	EntityManager entityManager;

	public State save(State state) {
		return stateRepository.save(state);
	}

	public List<State> save(List<State> states) {
		return stateRepository.saveAll(states);
	}

	public EntryItem<State> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																Integer pageNumber, Integer pageSize) {
		List<State> states;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<State> cq = cb.createQuery(State.class);
		Root<State> stateRoot = cq.from(State.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(State.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, stateRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, stateRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<State> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		states = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, states);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<State> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public State findById(Long id) {
		return stateRepository.findById(id).orElse(null);
	}
}
