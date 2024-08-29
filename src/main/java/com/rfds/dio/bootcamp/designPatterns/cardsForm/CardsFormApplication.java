package com.rfds.dio.bootcamp.designPatterns.cardsForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CardsFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsFormApplication.class, args);
	}

}
