package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notification")
@NoArgsConstructor
@Getter
@Setter
public class Notification {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "reseller_id")
	private Long resellerId;

	@Column(name = "title")
	private String title;

	@Column(name = "title2")
	private String title2;

	@Column(name = "body")
	private String body;


}
