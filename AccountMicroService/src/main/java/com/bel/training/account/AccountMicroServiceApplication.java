package com.bel.training.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AccountMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroServiceApplication.class, args);
	}

}
