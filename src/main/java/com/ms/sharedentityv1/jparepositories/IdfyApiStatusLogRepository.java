package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.IdfyApiStatusLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdfyApiStatusLogRepository extends JpaRepository<IdfyApiStatusLog, Long> {
}
