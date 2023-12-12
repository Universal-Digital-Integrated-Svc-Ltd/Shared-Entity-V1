package com.ms.sharedentityv1.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class IdfyApiStatusLogDto {
	private Long id;

	private String apiName;

	private String taskId;

	private String groupId;

	private String request;

	private String response;

	private String requestIp;


}
