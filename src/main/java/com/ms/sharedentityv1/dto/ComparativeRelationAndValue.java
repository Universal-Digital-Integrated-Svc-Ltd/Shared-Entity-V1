package com.ms.sharedentityv1.dto;

import com.ms.sharedentityv1.enums.ComparativeRelation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ComparativeRelationAndValue {
	private Object value;
	private ComparativeRelation comparativeRelation;
}