package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
