package com.ms.sharedentityv1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@NoArgsConstructor
@Getter
@Setter
@EnableJpaRepositories
public class SharedEntityV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SharedEntityV1Application.class, args);
	}

}
