package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shiprocket_req_resp_log")
@NoArgsConstructor
@Getter
@Setter
public class ShiprocketReqRespLog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "order_item_id")
	private String orderItemId;

	@Column(name = "req_body")
	private String reqBody;

	@Column(name = "response_data")
	private String responseData;

	@Column(name = "api_type")
	private String apiType;

	@Column(name = "created_at")
	private String createdAt;


}
