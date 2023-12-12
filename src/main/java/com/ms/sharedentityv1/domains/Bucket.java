package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "bucket")
@NoArgsConstructor
@Getter
@Setter
public class Bucket {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "priority")
	private Long priority;

	@Column(name = "end_time")
	private long endTime;

	@Column(name = "parent_bucket_id")
	private Long parentBucketId;

	@Column(name = "description")
	private String description;

	@Column(name = "start_time")
	private long startTime;

	@Column(name = "deep_link_name")
	private String deepLinkName;

	@Column(name = "bucket_type_id")
	private Long bucketTypeId;

	@Column(name = "zone_id")
	private Long zoneId;

	@Column(name = "bucket_design")
	private String bucketDesign;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "updated_date")
	private Date updatedDate;


}
