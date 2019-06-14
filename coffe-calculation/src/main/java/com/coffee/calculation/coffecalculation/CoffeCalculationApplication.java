package com.coffee.calculation.coffecalculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CoffeCalculationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeCalculationApplication.class, args);
	}

}
