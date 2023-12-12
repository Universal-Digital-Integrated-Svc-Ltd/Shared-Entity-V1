package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.OrderItemStatusLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemStatusLogRepository extends JpaRepository<OrderItemStatusLog, Long> {
}
