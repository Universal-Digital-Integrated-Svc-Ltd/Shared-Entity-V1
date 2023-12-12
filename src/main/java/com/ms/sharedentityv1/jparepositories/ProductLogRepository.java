package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ProductLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductLogRepository extends JpaRepository<ProductLog, Long> {
}
