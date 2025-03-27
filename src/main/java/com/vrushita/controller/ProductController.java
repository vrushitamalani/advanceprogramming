package com.vrushita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vrushita.model.Product;
import com.vrushita.service.ProductService;

public class ProductController {
	 @Autowired private ProductService service;
	    @GetMapping("/getProducts") public List<Product> getProducts() { return service.getProducts(); }
	    @PostMapping("/addProduct") public Product addProduct(@RequestBody Product product) { return service.addProduct(product); }

}
