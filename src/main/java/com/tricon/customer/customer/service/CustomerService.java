package com.tricon.customer.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tricon.customer.customer.CustomerNotFoundException;
import com.tricon.customer.customer.customerpojo.Customer;
import com.tricon.customer.customer.dao.ICustomerRepository;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Service
public class CustomerService {
	
	@Autowired
	ICustomerRepository customerRepository;

public  List<Customer>getAllCustomers(){
		
		return (List<Customer>) customerRepository.findAll();
	}

@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Customer addNewCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}

@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public  Customer updateCustomerById(Customer customer) {
		return customerRepository.save(customer);
		
	}

	public Optional<Customer> getCustomerById(String id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if(!customer.isPresent()) {
			throw new CustomerNotFoundException("id-" +id);
		}

	    
		return customerRepository.findById(id);
	}

}
