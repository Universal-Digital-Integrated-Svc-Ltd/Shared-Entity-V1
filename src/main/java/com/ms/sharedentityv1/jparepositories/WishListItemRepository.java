package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListItemRepository extends JpaRepository<WishListItem, Long> {
}
