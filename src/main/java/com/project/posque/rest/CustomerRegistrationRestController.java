package com.project.posque.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.posque.entity.Customer;
import com.project.posque.repository.CustomerJpaRepository;

@RestController
public class CustomerRegistrationRestController {
	
	@Autowired
	private CustomerJpaRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> insertCustomer(@RequestBody Customer customer) {
		Customer newCustomer = customerRepository.save(customer);
		return ResponseEntity.ok(newCustomer);
				
	}
	
}
