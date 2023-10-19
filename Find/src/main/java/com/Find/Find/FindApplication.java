package com.Find.Find;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@SpringBootApplication
//public class FindApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(FindApplication.class, args);
//	}
//
//	// Define a custom port here
//
//}



@SpringBootApplication
public class FindApplication {
	public static void main(String[] args) {
		SpringApplication.run(FindApplication.class, args);
	}

	// Configure CORS globally for your application
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// Allow requests from your React frontend (adjust the origin as needed)
				registry.addMapping("/bookings/**")
						.allowedOrigins("http://localhost:3000")
						.allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}
}
