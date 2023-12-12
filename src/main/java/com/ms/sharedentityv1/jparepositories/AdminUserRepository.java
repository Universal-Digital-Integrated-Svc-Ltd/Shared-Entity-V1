package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
}
