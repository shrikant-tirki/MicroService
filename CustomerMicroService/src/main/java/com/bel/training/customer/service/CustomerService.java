package com.bel.training.customer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bel.training.customer.model.Customer;
import com.bel.training.customer.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository crepo;
	
	public List<Customer> getCustomers(){
		return crepo.findAll();
	}
	
	public List<Customer> saveCustomer(Customer c){
		crepo.save(c);
		return crepo.findAll();
	}
	
	public Customer getCustomer(Long pId) {
		return crepo.findById(pId).get();
	}
	
	public Customer updateCustomer(Long id,Customer c) {
		return crepo.save(c);
	}
	
	public void deleteCustomer(Long id) {
		crepo.deleteById(id);
	}
}
