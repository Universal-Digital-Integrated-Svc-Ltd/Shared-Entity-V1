package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCatalogRepository extends JpaRepository<ProductCatalog, Long> {
}
