package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.SupplierBlacklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierBlacklistRepository extends JpaRepository<SupplierBlacklist, Long> {
}
