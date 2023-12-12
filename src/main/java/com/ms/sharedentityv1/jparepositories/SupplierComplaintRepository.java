package com.ms.sharedentityv1.jparepositories;

import com.ms.sharedentityv1.domains.SupplierComplaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierComplaintRepository extends JpaRepository<SupplierComplaint, Long> {
}
