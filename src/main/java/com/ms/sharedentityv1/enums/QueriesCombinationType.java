package com.ms.sharedentityv1.enums;

import lombok.Getter;

@Getter
public enum QueriesCombinationType {
	all_or("equal"),
	all_and("greaterThan"),
	partial_or("notEqual"),
	partial_and("lessThan");
	String methodAssociated;

	QueriesCombinationType(String methodAssociated) {
		this.methodAssociated = methodAssociated;
	}
}
