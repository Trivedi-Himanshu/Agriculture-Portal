package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Address;
import com.app.entities.Customer;
import java.util.List;
import java.lang.String;

public interface AddressDao extends JpaRepository<Address, Integer>{
	List<Address> findByCustomerId(int customerid);
	List<Address> findByState(String state);
	List<Address> findByCountry(String country);
	
	List<Address> findByCity(String city);
	
	@Modifying
    @Query ("DELETE FROM Address a WHERE a.customerId = :custid")
    void deleteBycustId(Integer custid);
}
