package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDao;
import com.app.entities.Customer;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	public List<Customer> findAll(){
		List<Customer> ListCustomer = customerDao.findAll();
		return ListCustomer;
	}
	
	public Customer findByEmail(String email) {
		return customerDao.findByEmail(email);
	}
	
	public Boolean addCustomer(Customer customer) {
		boolean flag = false;
		customerDao.save(customer);
		flag = true;
		return flag;
	}
}
