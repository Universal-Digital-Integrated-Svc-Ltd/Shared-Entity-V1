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
@Table(name = "shared_product")
@NoArgsConstructor
@Getter
@Setter
public class SharedProduct {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "reseller_id")
	private Long resellerId;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "type")
	private String type;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;


}
