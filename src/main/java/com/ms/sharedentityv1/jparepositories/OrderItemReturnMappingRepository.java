package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.OrderItemReturnMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemReturnMappingRepository extends JpaRepository<OrderItemReturnMapping, Long> {
}
