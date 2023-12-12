package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.SecurityImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityImageRepository extends JpaRepository<SecurityImage, Long> {
}
