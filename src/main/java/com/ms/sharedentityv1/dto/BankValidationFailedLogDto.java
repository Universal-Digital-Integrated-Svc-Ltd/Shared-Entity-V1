package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class BankValidationFailedLogDto {
	private Long id;

	private String typeOfUser;

	private Long userId;

	private String bankDetails;

	private String respStatus;

	private String requestIp;


}
