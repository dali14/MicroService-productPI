package org.sid.productservice;

import org.sid.productservice.entities.Product;
import org.sid.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (ProductRepository productRepository){
		return args -> {

			productRepository.saveAll(
					List.of(
							Product.builder().name("pen").price(5.0).image("Link1").build(),
							Product.builder().name("basket").price(15.5).image("Link2").build(),
							Product.builder().name("book").price(3.3).image("Link3").build()

					)

			);
		};
	}

}
