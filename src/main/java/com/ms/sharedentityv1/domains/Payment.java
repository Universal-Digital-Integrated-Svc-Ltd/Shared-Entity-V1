package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payment")
@NoArgsConstructor
@Getter
@Setter
public class Payment {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "payment_status")
	private String paymentStatus;

	@Column(name = "payment_mode")
	private String paymentMode;

	@Column(name = "razor_pay_payment_id")
	private String razorPayPaymentId;

	@Column(name = "razor_pay_order_id")
	private String razorPayOrderId;

	@Column(name = "redirect_url")
	private String redirectUrl;

	@Column(name = "payment_method")
	private String paymentMethod;


}
