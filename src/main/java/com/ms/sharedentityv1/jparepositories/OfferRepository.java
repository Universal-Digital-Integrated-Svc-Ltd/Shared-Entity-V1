package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
