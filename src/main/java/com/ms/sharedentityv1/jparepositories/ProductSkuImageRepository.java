package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ProductSkuImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSkuImageRepository extends JpaRepository<ProductSkuImage, Long> {
}
