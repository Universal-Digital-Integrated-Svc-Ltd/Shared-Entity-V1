package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bank_validation_failed_log")
@NoArgsConstructor
@Getter
@Setter
public class BankValidationFailedLog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "type_of_user")
	private String typeOfUser;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "bank_details")
	private String bankDetails;

	@Column(name = "resp_status")
	private String respStatus;

	@Column(name = "request_ip")
	private String requestIp;

	@Column(name = "created_at")
	private long createdAt;


}
