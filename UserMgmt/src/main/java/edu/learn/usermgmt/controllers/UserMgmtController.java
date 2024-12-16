package edu.learn.usermgmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learn.usermgmt.Services.UserServices;
import edu.learn.usermgmt.model.User;
import edu.learn.usermgmt.model.UserReq;

@RestController
@RequestMapping(path = "api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserMgmtController {

	@Autowired
	private UserServices userServices;

	@GetMapping()
	public ResponseEntity<?> fetchUsersData(@RequestParam(required = false) Long userId) {

		if (null != userId) {
			User user = userServices.readUsersDataByUserId(userId);
			if (null != user) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			List<User> allUsers = userServices.getAllUsers();
			return new ResponseEntity<>(allUsers, HttpStatus.OK);
		}
	}

	@PostMapping()
	public ResponseEntity<?> addUsers(@RequestBody UserReq newUser) {
		try {
			userServices.writeUsersToFile(newUser);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User userDeatils) {
		try {
			User updatedUser = userServices.updateUsersData(userId, userDeatils);
			return new ResponseEntity<>(updatedUser, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable Long userId) {
		try {
			userServices.deleteUser(userId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
