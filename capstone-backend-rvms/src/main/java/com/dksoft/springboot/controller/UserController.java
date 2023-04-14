package com.dksoft.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dksoft.springboot.exception.ResourceNotFoundException;
import com.dksoft.springboot.model.User;
import com.dksoft.springboot.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	//get all user data
	@GetMapping("/users")
	public List<User> getAllUserData(){
		return userRepository.findAll();
	}
	
	// create users
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	// get user by id
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		
		User user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("There is no user exist with id:" +id));
		
		return ResponseEntity.ok(user);
	}
	

	// update user
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
		
		User user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("There is no user exist with id:" +id));
		
		user.setUserName(userDetails.getUserName());	
		user.setPassword(userDetails.getPassword());
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setEmail(userDetails.getEmail());
		user.setMobile(userDetails.getMobile());

		
		User updatedUser = userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}	
	
	
	// delete user
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Long id) {
		
		User user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("There is no user exist with id:" +id));
		
		userRepository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
