package com.vrushita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrushita.model.Product;
import com.vrushita.repository.IProductRepository;

@Service
public class ProductService {
	@Autowired private IProductRepository repo;
    public List<Product> getProducts() { return repo.findAll(); }
    public Product addProduct(Product product) { return repo.save(product); }

}
