package com.ms.sharedentityv1.dao;

import com.ms.sharedentityv1.domains.Video;
import com.ms.sharedentityv1.dto.ComparativeRelationAndValue;
import com.ms.sharedentityv1.dto.EntryItem;
import com.ms.sharedentityv1.dto.GenericSearchFilter;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import com.ms.sharedentityv1.jparepositories.VideoRepository;
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
public class VideoDao {
	@Autowired
	VideoRepository videoRepository;
	@PersistenceContext
	EntityManager entityManager;

	public Video save(Video video) {
		return videoRepository.save(video);
	}

	public List<Video> save(List<Video> videos) {
		return videoRepository.saveAll(videos);
	}

	public EntryItem<Video> findByCriteriaFields(GenericSearchFilter genericSearchFilter,
																Integer pageNumber, Integer pageSize) {
		List<Video> videos;
		Map<String, ComparativeRelationAndValue> searchParams = genericSearchFilter.getSearchParams();
		log.info("Finding by criteria fields in dao as passed");
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Video> cq = cb.createQuery(Video.class);
		Root<Video> videoRoot = cq.from(Video.class);
		CriteriaQuery<Long> countCQ = cb.createQuery(Long.class);
		countCQ.select(cb.count(countCQ.from(Video.class)));
		List<Predicate> predicates = new LinkedList<>();
		for (Map.Entry<String, ComparativeRelationAndValue> entry : searchParams.entrySet()) {
			UtilityMethods.fillCriteriaQuery(cb, entry, videoRoot, predicates);
		}
		processQueriesCombination(genericSearchFilter.getCombinationType(), predicates, cb, cq, countCQ);
		List<Order> orderBys = UtilityMethods.getOrderBys(cb, videoRoot, genericSearchFilter.getOrderBy());
		cq.orderBy(orderBys);
		TypedQuery<Video> query = entityManager.createQuery(cq);
		Long count = entityManager.createQuery(countCQ).getSingleResult();
		if (pageNumber == null) pageNumber = 0;
		if (pageSize == null || pageSize == 0) pageSize = 10;
		int offset = pageNumber * pageSize;
		videos = query.setFirstResult(offset).setMaxResults(pageSize).getResultList();
		return new EntryItem<>(count, videos);
	}

	private void processQueriesCombination(QueriesCombinationType combinationType, List<Predicate> predicates, CriteriaBuilder cb, CriteriaQuery<Video> cq, CriteriaQuery<Long> countCQ) {

		if (combinationType== QueriesCombinationType.all_and) {
			cq.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		} else {
			cq.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
			countCQ.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		}
	}


	public Video findById(Long id) {
		return videoRepository.findById(id).orElse(null);
	}
}
