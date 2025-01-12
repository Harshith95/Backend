package com.example.ecommerce_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_backend.model.Cart;
import com.example.ecommerce_backend.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping
	public List<Cart> getAllCartItems() {
		return cartService.getAllCartItems();
	}

	@PostMapping
	public Cart addToCart(@RequestBody Cart cart) {
		return cartService.addToCart(cart);
	}

	@DeleteMapping("{id}")
	public void removeFromCart(@PathVariable Long id) {
		cartService.removeFromCart(id);
	}
}