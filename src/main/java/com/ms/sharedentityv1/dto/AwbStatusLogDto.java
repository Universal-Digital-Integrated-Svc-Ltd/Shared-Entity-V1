package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class AwbStatusLogDto {
	private Long id;

	private String awbNumber;

	private String statusCode;

	private String partner;

	private String source;


}
