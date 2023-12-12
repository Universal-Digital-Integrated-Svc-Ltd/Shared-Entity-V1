package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class RatingProductDto {
	private Long id;

	private Long resellerId;

	private Long productId;

	private String rating;


	private String review;


}
