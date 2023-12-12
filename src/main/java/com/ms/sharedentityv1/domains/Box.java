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
@Table(name = "box")
@NoArgsConstructor
@Getter
@Setter
public class Box {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "height")
	private int height;

	@Column(name = "length")
	private int length;

	@Column(name = "width")
	private int width;

	@Column(name = "weight")
	private int weight;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;


}
