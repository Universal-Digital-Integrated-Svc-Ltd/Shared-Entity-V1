package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
