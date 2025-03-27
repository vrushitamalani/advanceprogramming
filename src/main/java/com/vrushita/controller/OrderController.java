package com.vrushita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrushita.model.Order;
import com.vrushita.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping("/getOrders")
	public List<Order> getOrders() {
		return service.getOrders();
	}

	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order) {
		return service.addOrder(order);
	}

}
