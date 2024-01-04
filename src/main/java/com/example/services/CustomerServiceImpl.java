package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.repositories.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepository;
	
	private CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public Long createCustomer() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setLastName("Doe");
		customerRepository.save(customer);
		
		return customer.getCustomerId();
	}
	

}
