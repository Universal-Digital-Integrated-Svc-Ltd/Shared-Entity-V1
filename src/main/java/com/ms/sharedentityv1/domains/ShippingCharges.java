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
@Table(name = "shipping_charges")
@NoArgsConstructor
@Getter
@Setter
public class ShippingCharges {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "category_ids")
	private String categoryIds;

	@Column(name = "shipping_charge")
	private String shippingCharge;

	@Column(name = "start_time")
	private long startTime;

	@Column(name = "end_time")
	private String endTime;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;


}
