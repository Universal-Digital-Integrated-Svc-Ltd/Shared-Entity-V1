package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rating_review_image")
@NoArgsConstructor
@Getter
@Setter
public class RatingReviewImage {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "rating_id")
	private Long ratingId;

	@Column(name = "url")
	private String url;


}
