package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shiprocket_pickup_locations")
@NoArgsConstructor
@Getter
@Setter
public class ShiprocketPickupLocations {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "pickup_loc_name")
	private String pickupLocName;

	@Column(name = "pickup_loc_id")
	private String pickupLocId;

	@Column(name = "address")
	private String address;

	@Column(name = "supplier_email")
	private String supplierEmail;

	@Column(name = "created_at")
	private String createdAt;


}
