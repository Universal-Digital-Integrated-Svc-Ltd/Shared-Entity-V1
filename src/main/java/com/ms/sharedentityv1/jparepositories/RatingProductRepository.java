package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.RatingProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingProductRepository extends JpaRepository<RatingProduct, Long> {
}
