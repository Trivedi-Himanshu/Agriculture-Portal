package com.app.service;

import java.util.ArrayList;
import java.util.List;
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
	private AddressDao addressDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<CustomerDTO> findAll(){
		List<CustomerDTO> listCustDto = new ArrayList<CustomerDTO>(); 

		List<Customer> listCustomer = customerDao.findAll();
		
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
//		Address addr=mapper.map(dto, Address.class);
//		addr.setCustomerId(cust);                    //----this is the change i have made
		
		
		customerDao.save(cust);
//		addressDao.save(addr);
		
		flag = true;
		return flag;
	}
}
