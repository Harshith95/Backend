package com.example.ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
