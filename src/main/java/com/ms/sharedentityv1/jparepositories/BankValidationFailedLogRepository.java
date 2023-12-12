package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.BankValidationFailedLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankValidationFailedLogRepository extends JpaRepository<BankValidationFailedLog, Long> {
}
