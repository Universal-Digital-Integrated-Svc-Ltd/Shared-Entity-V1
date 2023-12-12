package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shipping_partner_load_allocation")
@NoArgsConstructor
@Getter
@Setter
public class ShippingPartnerLoadAllocation {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "partner")
	private String partner;

	@Column(name = "percentage")
	private Long percentage;

	@Column(name = "order_count")
	private Long orderCount;

	@Column(name = "start_date")
	private String startDate;

	@Column(name = "end_date")
	private String endDate;

	@Column(name = "created_at")
	private String createdAt;


}
