package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AddressDao;
import com.app.dao.CustomerDao;
import com.app.dto.AddressDTO;
import com.app.dto.CustomerDTO;
import com.app.entities.Address;
import com.app.entities.Customer;

@Service
@Transactional
public class AddressService implements IAddressService{
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CustomerDao custDao;
	
	@Autowired
	private AddressDao dao;

	@Override
	public Address updateById(CustomerDTO dto, int customerId) {
		//Customer cust = mapper.map(custDao, Customer.class); //at this time just want default c'tor to called of Customer
		
		Customer cust = custDao.findByEmail(dto.getEmail());
			if(cust != null) {
					
				Address addr = mapper.map(dto, Address.class);
					
				addr.setCustomerId(cust);
					
				return dao.save(addr);
			}
		return null;
	}

	@Override
	public Address getByCustId(int customerId) {
		
		List<Address> addrss =  dao.findByCustomerId(customerId);
		return addrss.get(0);
	}

	@Override
	public boolean delByCustId(int customerId) {

		boolean flag = false;
		dao.deleteBycustId(customerId);
		flag = true;
		return flag;
	}
	
	
}
