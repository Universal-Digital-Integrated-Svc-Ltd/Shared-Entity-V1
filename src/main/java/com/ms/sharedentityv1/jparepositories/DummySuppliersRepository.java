package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.DummySuppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummySuppliersRepository extends JpaRepository<DummySuppliers, Long> {
}
