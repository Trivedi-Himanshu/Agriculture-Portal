package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;
import com.app.entities.Customer;
import java.util.List;
import java.lang.String;

public interface AddressDao extends JpaRepository<Address, Integer>{
	List<Address> findByCustomerId(Customer customerid);
	List<Address> findByState(String state);
	List<Address> findByCountry(String country);
	List<Address> findByCity(String city);
}
