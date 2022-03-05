package com.bel.training.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bel.training.customer.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
