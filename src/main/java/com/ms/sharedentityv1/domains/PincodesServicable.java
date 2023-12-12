package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pincodes_servicable")
@NoArgsConstructor
@Getter
@Setter
public class PincodesServicable {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "zipcode")
	private Long zipcode;

	@Column(name = "partner")
	private String partner;

	@Column(name = "process_code")
	private String processCode;

	@Column(name = "temporary_not_serviceable")
	private Boolean temporaryNotServiceable;


}
