package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
