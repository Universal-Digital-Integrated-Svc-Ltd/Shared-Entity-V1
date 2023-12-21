package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ResellerAddresses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResellerAddressesRepository extends JpaRepository<ResellerAddresses, Long> {
}