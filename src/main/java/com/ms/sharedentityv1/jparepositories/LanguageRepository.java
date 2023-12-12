package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
