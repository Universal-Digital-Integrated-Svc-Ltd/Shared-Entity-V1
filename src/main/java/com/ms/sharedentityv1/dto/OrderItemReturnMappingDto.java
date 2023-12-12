package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class OrderItemReturnMappingDto {
	private Long id;

	private Long orderItemId;

	private Long returnDeliveryId;


}
