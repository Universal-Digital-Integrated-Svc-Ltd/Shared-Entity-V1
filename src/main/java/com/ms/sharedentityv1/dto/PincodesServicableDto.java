package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class PincodesServicableDto {
	private Long id;

	private Long zipcode;

	private String partner;

	private String processCode;

	private Boolean temporaryNotServiceable;


}
