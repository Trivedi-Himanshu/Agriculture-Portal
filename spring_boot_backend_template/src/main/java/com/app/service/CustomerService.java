package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AddressDao;
import com.app.dao.CustomerDao;
import com.app.dto.CustomerDTO;
import com.app.entities.Address;
import com.app.entities.Customer;

@Service
@Transactional
public class CustomerService implements ICustomerService{
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<Customer> findAll(){
		List<Customer> ListCustomer = customerDao.findAll();
		return ListCustomer;
	}
	
	@Override
	public Customer findByEmail(String email) {
		return customerDao.findByEmail(email);
	}
	
	@Override
	public Boolean addCustomer(CustomerDTO dto) {
		boolean flag = false;
		Customer cust=mapper.map(dto, Customer.class);
		Address addr=mapper.map(dto, Address.class);
		addr.setCustomerId(cust);                    //----this is the change i have made
		
		
		customerDao.save(cust);
		addressDao.save(addr);
		
		flag = true;
		return flag;
	}
}
