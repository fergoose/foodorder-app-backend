package com.fergusgolledge.foodapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.fergusgolledge.models")
@SpringBootApplication
public class FoodappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodappApplication.class, args);
	}

}
