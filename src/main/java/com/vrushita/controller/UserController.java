package com.vrushita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrushita.model.User;
import com.vrushita.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return service.getUsers();
	}

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
}
