package com.ms.sharedentityv1.dto;

import com.ms.sharedentityv1.enums.OrderByType;
import com.ms.sharedentityv1.enums.QueriesCombinationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class GenericSearchFilter {
	private QueriesCombinationType combinationType = QueriesCombinationType.all_and;
	private Map<String, ComparativeRelationAndValue> searchParams;
	private Map<String, OrderByType> orderBy;
}
