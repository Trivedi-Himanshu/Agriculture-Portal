package com.app.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	private ModelMapper mapper;
	
	@Override

	public List<CustomerDTO> findAll(){
		
		List<CustomerDTO> listCustDto = new ArrayList<CustomerDTO>(); 
		
		Comparator<Customer> comp = (Customer c1, Customer c2) -> {
			return c1.getEmail().compareTo(c1.getEmail());
		};
		
		List<Customer> listCustomer = customerDao.findAll().stream().sorted(comp).collect(Collectors.toList());
		
		listCustDto = listCustomer.stream()
	            .map(c -> mapper.map(c, CustomerDTO.class))
	            .collect(Collectors.toList());
		
		return listCustDto;

	}
	
	@Override
	public CustomerDTO findByEmail(String email) {
		
		Customer cust = customerDao.findByEmail(email);
		
		CustomerDTO custDto = mapper.map(cust, CustomerDTO.class);
		
		return custDto;
	}
	
	@Override
	public Boolean addCustomer(CustomerDTO dto) {
		boolean flag = false;
		Customer cust=mapper.map(dto, Customer.class);
	
		customerDao.save(cust);
		
		flag = true;
		return flag;
	}
	
	public CustomerDTO update(CustomerDTO dto, String email) {
		Customer cust = customerDao.findByEmail(email);
		
		if(cust == null) {
			return null;
		}
		
//		customerDao.delete(cust);
		
		cust = mapper.map(dto, Customer.class);
		
		return mapper.map(customerDao.save(cust),CustomerDTO.class);
	}
}
