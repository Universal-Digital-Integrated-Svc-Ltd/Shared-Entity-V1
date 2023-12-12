package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.BucketImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketImageRepository extends JpaRepository<BucketImage, Long> {
}
