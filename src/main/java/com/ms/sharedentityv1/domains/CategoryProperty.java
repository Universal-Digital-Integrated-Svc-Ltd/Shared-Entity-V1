package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category_property")
@NoArgsConstructor
@Getter
@Setter
public class CategoryProperty {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "property_name")
	private String propertyName;

	@Column(name = "is_mandatory")
	private Boolean isMandatory;


}
