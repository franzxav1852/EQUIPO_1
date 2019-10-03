package com.everis.actividadequipo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ActividadEquipo1Application {

	public static void main(String[] args) {
		SpringApplication.run(ActividadEquipo1Application.class, args);
	}

}
