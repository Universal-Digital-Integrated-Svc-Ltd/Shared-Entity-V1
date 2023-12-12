package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "return_delivery")
@NoArgsConstructor
@Getter
@Setter
public class ReturnDelivery {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "return_reason")
	private String returnReason;

	@Column(name = "return_date")
	private String returnDate;

	@Column(name = "return_AWB_number")
	private String returnAwbNumber;

	@Column(name = "return_shipping_partner")
	private String returnShippingPartner;

	@Column(name = "penalty")
	private String penalty;

	@Column(name = "penalty_amount")
	private String penaltyAmount;

	@Column(name = "status")
	private String status;

	@Column(name = "address_id")
	private Long addressId;

	@Column(name = "return_reason_params")
	private String returnReasonParams;


}
