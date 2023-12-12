package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
