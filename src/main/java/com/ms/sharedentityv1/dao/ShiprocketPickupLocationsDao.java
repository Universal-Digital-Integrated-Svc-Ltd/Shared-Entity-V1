package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.ShiprocketPickupLocations;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.ShiprocketPickupLocationsRepository;
import com.ms.sharedentityv1.utility.UtilityMethods;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ShiprocketPickupLocationsDao {
	@Autowired
	ShiprocketPickupLocationsRepository shiprocketPickupLocationsRepository;
	@PersistenceContext
	EntityManager entityManager;

	public ShiprocketPickupLocations save(ShiprocketPickupLocations shiprocketPickupLocations) {
		return shiprocketPickupLocationsRepository.save(shiprocketPickupLocations);
	}

	public List<ShiprocketPickupLocations> save(List<ShiprocketPickupLocations> shiprocketPickupLocationss) {
		return shiprocketPickupLocationsRepository.saveAll(shiprocketPickupLocationss);
	}

	public EntryItem<ShiprocketPickupLocations> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																	 Integer pageNumber, Integer pageSize) {
		List<ShiprocketPickupLocations> shiprocketPickupLocationss;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ShiprocketPickupLocations> cq = cb.createQuery(ShiprocketPickupLocations.class);
		Root<ShiprocketPickupLocations> shiprocketPickupLocationsRoot = cq.from(ShiprocketPickupLocations.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(ShiprocketPickupLocations.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, shiprocketPickupLocationsRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, shiprocketPickupLocationsRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<ShiprocketPickupLocations> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		shiprocketPickupLocationss = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, shiprocketPickupLocationss);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<ShiprocketPickupLocations> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public ShiprocketPickupLocations findById(Long id) {
		return shiprocketPickupLocationsRepository.findById(id).orElse(null);
	}
}
