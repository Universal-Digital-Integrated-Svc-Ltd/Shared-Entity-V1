package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "onboarders")
@NoArgsConstructor
@Getter
@Setter
public class Onboarders {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;


}