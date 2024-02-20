package com.app.service;

import com.app.dto.CustomerDTO;
import com.app.entities.Address;

public interface IAddressService {
	
	Address updateById(CustomerDTO dto, int customerId);
	
	Address getByCustId(int customerId);
	
	boolean delByCustId(int customerId);
	
}
