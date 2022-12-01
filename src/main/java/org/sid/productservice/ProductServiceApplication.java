package org.sid.productservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (){
		return args -> {

		};
	}

}
