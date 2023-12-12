package com.ms.sharedentityv1.domains;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "alembic_version")
@NoArgsConstructor
@Getter
@Setter
public class AlembicVersion {
	@Id
	@Column(name = "version_num")
	private String versionNum;
}
