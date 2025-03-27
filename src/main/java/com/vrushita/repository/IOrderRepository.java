package com.vrushita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrushita.model.Order;

public interface IOrderRepository extends JpaRepository<Order, Integer> {

}
