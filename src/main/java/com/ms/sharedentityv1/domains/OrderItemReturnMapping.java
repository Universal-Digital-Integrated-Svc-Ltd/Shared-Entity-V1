package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item_return_mapping")
@NoArgsConstructor
@Getter
@Setter
public class OrderItemReturnMapping {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "order_item_id")
	private Long orderItemId;

	@Column(name = "return_delivery_id")
	private Long returnDeliveryId;


}
