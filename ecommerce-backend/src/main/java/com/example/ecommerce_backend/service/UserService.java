package com.example.ecommerce_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.ecommerce_backend.model.User;
import com.example.ecommerce_backend.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * @Autowired private PasswordEncoder passwordEncoder;
	 */
	public User registerUser(String username, String password, String role) {
		if (userRepository.findByUsername(username).isPresent()) {
			throw new IllegalArgumentException("Username already exists!");
		}

		User user = new User();
		user.setUsername(username);
//		user.setPassword(passwordEncoder.encode(password));
		user.getRoles().add(role);

		return userRepository.save(user);
	}
}
