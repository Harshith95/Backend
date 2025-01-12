package com.example.ecommerce_backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_backend.model.Product;
import com.example.ecommerce_backend.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService prodServices;

	@GetMapping()
	public ResponseEntity getAllProducts(@RequestParam(value = "id", required = false) Long id) {
		List<Product> prodList = new ArrayList<Product>();
		if (id == null || id == 0) {
			prodList.addAll(prodServices.getAllProducts());
		} else {
			prodList.add(prodServices.getProductById(id));
		}
		return new ResponseEntity(prodList, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity addProduct(@RequestBody Product product) {
		Product prod = null;
		try {
			prod = prodServices.addProduct(product);
		} catch (Exception exc) {
			System.err.print("Error occured while adding a product");
			return new ResponseEntity(exc, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(prod, HttpStatus.CREATED);
	}

}
