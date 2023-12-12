package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ShipmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentHistoryRepository extends JpaRepository<ShipmentHistory, Long> {
}
