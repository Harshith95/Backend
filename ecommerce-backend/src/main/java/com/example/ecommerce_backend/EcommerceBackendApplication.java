package com.example.ecommerce_backend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ecommerce_backend.model.Product;
import com.example.ecommerce_backend.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EcommerceBackendApplication {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

	@PostConstruct
	public void loadSampleProducts() {
		if (productRepository.count() == 0) {
			productRepository.saveAll(Arrays.asList(

					new Product(null, "Laptop", 1000.00, "/images/laptop.png"),
					new Product(null, "Smartphone", 500.00, "/images/smartphone.png"),
					new Product(null, "Headset", 100.00, "/images/headset.png")));
		}
	}

}
