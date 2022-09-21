package com.elastic.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elastic.demo.model.Customer;
import com.elastic.demo.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	public CustomerRepository customerRepository;

	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<Customer> customers) {
		customerRepository.saveAll(customers);
		return customers.size();
	}

	@GetMapping("/findAll")
	public Iterable<Customer> findAllCustomer() {
		return customerRepository.findAll();
	}

	@GetMapping("/findByName/{firstName}")
	public List<Customer> findCustomerByName(@PathVariable String firstName) {
		System.out.println("inside firstName");
		return customerRepository.findByFirstName(firstName);
	}
}
