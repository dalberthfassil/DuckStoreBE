package com.ducks.store.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ducks.store")
public class DucksStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DucksStoreApplication.class, args);
	}

}
