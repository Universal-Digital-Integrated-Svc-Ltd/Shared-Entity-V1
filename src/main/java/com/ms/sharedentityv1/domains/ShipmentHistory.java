package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "shipment_history")
@NoArgsConstructor
@Getter
@Setter
public class ShipmentHistory {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "awb_number")
	private String awbNumber;

	@Column(name = "status")
	private String status;

	@Column(name = "status_date")
	private String statusDate;

	@Column(name = "expected_delivery_time")
	private String expectedDeliveryTime;

	@Column(name = "location")
	private String location;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "status_code")
	private String statusCode;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;

	@Column(name = "visible")
	private Boolean visible;

	@Column(name = "comment")
	private String comment;


}
