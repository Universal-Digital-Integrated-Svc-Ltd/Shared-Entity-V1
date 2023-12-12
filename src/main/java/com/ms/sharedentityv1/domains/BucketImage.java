package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bucket_image")
@NoArgsConstructor
@Getter
@Setter
public class BucketImage {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "url")
	private String url;

	@Column(name = "bucket_id")
	private Long bucketId;


}
