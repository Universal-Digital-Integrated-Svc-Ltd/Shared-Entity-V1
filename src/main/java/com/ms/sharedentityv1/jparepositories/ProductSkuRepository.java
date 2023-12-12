package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ProductSku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSkuRepository extends JpaRepository<ProductSku, Long> {
}
