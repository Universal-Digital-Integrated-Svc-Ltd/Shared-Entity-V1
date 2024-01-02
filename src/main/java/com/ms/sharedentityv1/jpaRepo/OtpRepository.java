package com.ms.sharedentityv1.jpaRepo;

import com.ms.sharedentityv1.domains.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpRepository extends JpaRepository<Otp, Long>  {

    Optional<Otp> findByUserIdAndEnabledTrue(Long userId);
}
