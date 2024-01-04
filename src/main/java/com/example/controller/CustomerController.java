package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("test")
	public ResponseEntity<String> test(){
		return ResponseEntity.ok("success");
	}
	
	@GetMapping("new")
	public ResponseEntity<Long> newCustomer(){
		
		return ResponseEntity.ok(customerService.createCustomer());
	}
	
}
