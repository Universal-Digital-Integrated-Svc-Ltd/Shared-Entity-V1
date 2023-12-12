package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
