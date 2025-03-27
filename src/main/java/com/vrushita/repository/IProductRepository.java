package com.vrushita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrushita.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
