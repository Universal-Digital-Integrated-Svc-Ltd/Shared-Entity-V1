package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
