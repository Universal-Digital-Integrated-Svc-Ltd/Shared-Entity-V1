package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bucket_sku")
@NoArgsConstructor
@Getter
@Setter
public class BucketSku {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "bucket_id")
	private Long bucketId;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "active_for_ranking")
	private Boolean activeForRanking;

	@Column(name = "bucket_preferred_rank")
	private Long bucketPreferredRank;


}
