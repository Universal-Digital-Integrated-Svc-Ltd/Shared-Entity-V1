package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
