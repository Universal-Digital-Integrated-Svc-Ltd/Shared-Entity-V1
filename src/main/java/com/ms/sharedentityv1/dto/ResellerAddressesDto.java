package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class ResellerAddressesDto {
	private Long id;

	private Long resellerId;

	private Long addressId;


}
