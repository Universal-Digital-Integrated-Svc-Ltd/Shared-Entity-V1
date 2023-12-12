package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.PaymentLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentLogRepository extends JpaRepository<PaymentLog, Long> {
}
