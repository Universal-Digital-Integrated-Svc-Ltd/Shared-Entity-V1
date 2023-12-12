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
@Table(name = "product_sku_image")
@NoArgsConstructor
@Getter
@Setter
public class ProductSkuImage {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "url")
	private String url;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "watermarked_image_url")
	private String watermarkedImageUrl;

	@Column(name = "thumbnail_generated")
	private Boolean thumbnailGenerated;

	@Column(name = "created_time")
	@CreatedDate
	private Date createdTime;

	@Column(name = "updated_time")
	@LastModifiedDate
	private Date updatedTime;


}
