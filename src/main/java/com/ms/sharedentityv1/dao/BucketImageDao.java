package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.BucketImage;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.BucketImageRepository;
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
public class BucketImageDao {
	@Autowired
	BucketImageRepository bucketImageRepository;
	@PersistenceContext
	EntityManager entityManager;

	public BucketImage save(BucketImage bucketImage) {
		return bucketImageRepository.save(bucketImage);
	}

	public List<BucketImage> save(List<BucketImage> bucketImages) {
		return bucketImageRepository.saveAll(bucketImages);
	}

	public EntryItem<BucketImage> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																Integer pageNumber, Integer pageSize) {
		List<BucketImage> bucketImages;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<BucketImage> cq = cb.createQuery(BucketImage.class);
		Root<BucketImage> bucketImageRoot = cq.from(BucketImage.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(BucketImage.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, bucketImageRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, bucketImageRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<BucketImage> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		bucketImages = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, bucketImages);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<BucketImage> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public BucketImage findById(Long id) {
		return bucketImageRepository.findById(id).orElse(null);
	}
}