package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "product_catalog")
@NoArgsConstructor
@Getter
@Setter
public class ProductCatalog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "supplier_id")
	private Long supplierId;

	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "approved")
	private Boolean approved;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "viewed")
	private Long viewed;

	@Column(name = "shared")
	private Long shared;

	@Column(name = "catalog_name")
	private String catalogName;

	@Column(name = "comment")
	private String comment;

	@Column(name = "pending_with")
	private String pendingWith;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;


}
