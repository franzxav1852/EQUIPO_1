package com.everis.actividadequipo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlmacenApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlmacenApplication.class, args);
	}

}
