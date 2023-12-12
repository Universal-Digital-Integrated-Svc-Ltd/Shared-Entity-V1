package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
