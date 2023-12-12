package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.AlembicVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlembicVersionRepository extends JpaRepository<AlembicVersion, Long> {
}
