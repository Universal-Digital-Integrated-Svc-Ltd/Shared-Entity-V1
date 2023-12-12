package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
