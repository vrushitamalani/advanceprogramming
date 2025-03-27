package com.vrushita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrushita.model.Order;
import com.vrushita.repository.IOrderRepository;

@Service
public class OrderService {
    @Autowired private IOrderRepository repo;
    public List<Order> getOrders() { return repo.findAll(); }
    public Order addOrder(Order order) { return repo.save(order); }
}
