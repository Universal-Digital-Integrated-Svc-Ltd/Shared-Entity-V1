package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<Zone, Long> {
}
