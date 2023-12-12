package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ActivateDeactivateLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivateDeactivateLogRepository extends JpaRepository<ActivateDeactivateLog, Long> {
}
