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
@Table(name = "supplier_payment")
@NoArgsConstructor
@Getter
@Setter
public class SupplierPayment {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "order_item_id")
	private Long orderItemId;

	@Column(name = "status")
	private String status;

	@Column(name = "discard_reason")
	private String discardReason;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "settlement_type_")
	private String settlementType;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;


}
