package com.example.ecommerce_backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce_backend.model.Cart;
import com.example.ecommerce_backend.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;

	public List<Cart> getAllCartItems() {
		return cartRepository.findAll();
	}

	public Cart addToCart(Cart cart) {
		return cartRepository.save(cart);
	}

	public void removeFromCart(Long id) {
		cartRepository.deleteById(id);
	}
}
