package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class ShippingPartnerLoadAllocationDto {
	private Long id;

	private String partner;

	private Long percentage;

	private Long orderCount;

	private String startDate;

	private String endDate;


}
