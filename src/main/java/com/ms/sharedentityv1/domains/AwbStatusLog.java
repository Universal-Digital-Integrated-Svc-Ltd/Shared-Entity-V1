package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "awb_status_log")
@NoArgsConstructor
@Getter
@Setter
public class AwbStatusLog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "awb_number")
	private String awbNumber;

	@Column(name = "status_code")
	private String statusCode;

	@Column(name = "partner")
	private String partner;

	@Column(name = "source")
	private String source;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;


}
