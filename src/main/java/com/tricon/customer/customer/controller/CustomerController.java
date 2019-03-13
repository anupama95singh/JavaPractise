package com.tricon.customer.customer.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.customer.customer.customerpojo.Customer;

import com.tricon.customer.customer.service.CustomerService;



@RequestMapping(value = "/tricon")
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
//	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
		
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> list = customerService.getAllCustomers();
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{customer_id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable String customer_id) {
		Optional<Customer> customer = customerService.getCustomerById(customer_id);
		return new ResponseEntity<Optional<Customer>>(customer, HttpStatus.OK);
	
		
	}
	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Customer> addNewCustomer(@Valid @RequestBody Customer customer) {
		Customer customerv = customerService.addNewCustomer(customer);
		 return new ResponseEntity<Customer>(customerv, HttpStatus.CREATED);
	}

	
	@RequestMapping(value = "/{customer_id}", method = RequestMethod.PUT)
	public ResponseEntity<Customer> updateCustomer(@Valid @RequestBody Customer customer ) {
		Customer customerv = customerService.updateCustomerById(customer);
		return new ResponseEntity<Customer>(customerv, HttpStatus.OK);
	}
}
