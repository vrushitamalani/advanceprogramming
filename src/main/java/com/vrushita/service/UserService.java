package com.vrushita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrushita.model.User;
import com.vrushita.repository.IUserRepository;

@Service
public class UserService {
	@Autowired
	private IUserRepository repo;

	public List<User> getUsers() {
		return repo.findAll();
	}

	public User addUser(User user) {
		return repo.save(user);
	}
}
