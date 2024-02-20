package com.app.service;

import java.util.List;

import com.app.dto.CustomerDTO;
import com.app.entities.Address;
import com.app.entities.Customer;

public interface ICustomerService {
	
	List<Customer> findAll();
	
	Customer findByEmail(String email);
	
	Boolean addCustomer(CustomerDTO dto);
}
