package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
