package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@NoArgsConstructor
@Getter
@Setter
public class OfferDto {
	private Long id;

	private Long productSkuId;

	private String name;

	private Date startDate;

	private Date endDate;


}
