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
@Table(name = "order_item_status_log")
@NoArgsConstructor
@Getter
@Setter
public class OrderItemStatusLog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "uc_order_id")
	private String ucOrderId;

	@Column(name = "awb_number")
	private String awbNumber;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "status")
	private String status;

	@Column(name = "source")
	private String source;


}
