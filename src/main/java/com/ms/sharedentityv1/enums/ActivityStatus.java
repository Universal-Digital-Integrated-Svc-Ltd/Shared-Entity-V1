package com.ms.sharedentityv1.enums;

import lombok.Getter;

@Getter
public enum ActivityStatus {
	ACTIVE("Active"),
	INACTIVE("Inactive");
	String description;

	ActivityStatus(String description) {
		this.description = description;
	}
}
