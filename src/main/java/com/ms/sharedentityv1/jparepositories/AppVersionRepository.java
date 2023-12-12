package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.AppVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppVersionRepository extends JpaRepository<AppVersion, Long> {
}
