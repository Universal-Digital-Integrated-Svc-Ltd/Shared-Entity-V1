package com.ms.sharedentityv1.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "otp", indexes = {
        @Index(name = "by_userId_enabled", columnList = "user_id, enabled")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Otp extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "otp")
    private String otp;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "enabled")
    private Boolean enabled = true;

    @Column(name = "send_count")
    private int sendCount = 1;

    public Otp(String otp, Long userId) {
        this.otp = otp;
        this.userId = userId;
    }

    public Otp(String otp, Long userId, String createdBY, String updatedBy) {
        this.otp = otp;
        this.userId = userId;
        setCreatedBy(createdBY);
        setUpdatedBy(updatedBy);
    }
}
