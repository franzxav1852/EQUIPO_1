package com.everis.actividadequipo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Import(SwaggerConfiguration.class)
public class ActividadEquipo1Application implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(ActividadEquipo1Application.class, args);
	}
	
	 @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	         registry.addResourceHandler("swagger-ui.html")
	                  .addResourceLocations("classpath:/META-INF/resources/");
	  }


}
