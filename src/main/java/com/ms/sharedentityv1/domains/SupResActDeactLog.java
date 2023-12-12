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
@Table(name = "sup_res_act_deact_log")
@NoArgsConstructor
@Getter
@Setter
public class SupResActDeactLog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "ad_log_id")
	private Long adLogId;

	@Column(name = "user_type")
	private String userType;

	@Column(name = "mobile_no")
	private String mobileNo;

	@Column(name = "status")
	private String status;

	@Column(name = "upload_status")
	private String uploadStatus;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;

	@Column(name = "sup_cat_id")
	private String supCatId;

	@Column(name = "sup_cat_count")
	private Long supCatCount;


}
