package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ShippingCharges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingChargesRepository extends JpaRepository<ShippingCharges, Long> {
}
