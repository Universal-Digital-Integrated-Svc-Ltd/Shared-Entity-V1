package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "app_configurables")
@NoArgsConstructor
@Getter
@Setter
public class AppConfigurables {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "param_key")
	private String paramKey;

	@Column(name = "param_value")
	private Long paramValue;

}
