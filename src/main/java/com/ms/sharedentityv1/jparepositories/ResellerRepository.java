package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Reseller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResellerRepository extends JpaRepository<Reseller, Long> {
}
