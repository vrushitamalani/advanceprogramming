package com.vrushita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrushita.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
