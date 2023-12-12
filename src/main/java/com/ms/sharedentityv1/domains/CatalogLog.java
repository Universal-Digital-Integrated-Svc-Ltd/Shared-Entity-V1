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
@Table(name = "catalog_log")
@NoArgsConstructor
@Getter
@Setter
public class CatalogLog {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "catalog_id")
	private Long catalogId;

	@Column(name = "action_by")
	private Long actionBy;

	@Column(name = "action_time")
	private long actionTime;

	@Column(name = "action")
	private String action;

	@Column(name = "cycle_completed")
	private Boolean cycleCompleted;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;


}
