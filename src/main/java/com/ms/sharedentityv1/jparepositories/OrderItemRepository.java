package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
