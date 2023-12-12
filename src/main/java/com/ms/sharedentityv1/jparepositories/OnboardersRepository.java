package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Onboarders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnboardersRepository extends JpaRepository<Onboarders, Long> {
}
