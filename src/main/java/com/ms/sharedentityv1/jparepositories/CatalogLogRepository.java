package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.CatalogLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogLogRepository extends JpaRepository<CatalogLog, Long> {
}
