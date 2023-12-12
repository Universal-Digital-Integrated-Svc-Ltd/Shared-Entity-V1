package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.SharedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharedProductRepository extends JpaRepository<SharedProduct, Long> {
}
