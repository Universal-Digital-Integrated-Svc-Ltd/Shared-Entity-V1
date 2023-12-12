package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.SupplierPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierPaymentRepository extends JpaRepository<SupplierPayment, Long> {
}
