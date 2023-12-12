package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "return_image_urls")
@NoArgsConstructor
@Getter
@Setter
public class ReturnImageUrls {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "return_id")
	private Long returnId;

	@Column(name = "image_url")
	private String imageUrl;


}
