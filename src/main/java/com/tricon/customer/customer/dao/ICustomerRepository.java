package com.tricon.customer.customer.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tricon.customer.customer.customerpojo.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, String>{

}
