package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.BucketSku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketSkuRepository extends JpaRepository<BucketSku, Long> {
}
