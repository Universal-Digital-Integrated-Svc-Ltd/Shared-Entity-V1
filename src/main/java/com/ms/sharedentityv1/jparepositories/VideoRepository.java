package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
