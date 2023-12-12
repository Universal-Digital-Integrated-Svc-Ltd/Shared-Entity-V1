package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "supplier_other_site_mapping")
@NoArgsConstructor
@Getter
@Setter
public class SupplierOtherSiteMapping {
	@Column(name = "supplier_id")
	@Id
	private Long id;

	@Column(name = "other_site_id")
	private Long otherSiteId;


}
