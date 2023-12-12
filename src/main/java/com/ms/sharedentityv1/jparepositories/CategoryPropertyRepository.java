package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.CategoryProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryPropertyRepository extends JpaRepository<CategoryProperty, Long> {
}
