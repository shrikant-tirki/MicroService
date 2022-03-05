package com.bel.training.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bel.training.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
	
}
