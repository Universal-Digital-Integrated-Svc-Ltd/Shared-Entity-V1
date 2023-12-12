package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.BucketItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketItemRepository extends JpaRepository<BucketItem, Long> {
}
