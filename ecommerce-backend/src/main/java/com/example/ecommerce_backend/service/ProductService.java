package com.example.ecommerce_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce_backend.model.Product;
import com.example.ecommerce_backend.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepo;

	public List<Product> getAllProducts() {
		return prodRepo.findAll();
	}

	public Product getProductById(Long id) {
		return prodRepo.findById(id).orElse(null);
	}

	public Product addProduct(Product product) {
		return prodRepo.save(product);
	}

}
