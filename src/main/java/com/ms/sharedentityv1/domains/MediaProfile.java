package com.ms.sharedentityv1.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "media_profile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MediaProfile extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

	@Column(name = "user_id")
	private String userId;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "profile_image")
    private String profileImage;

}