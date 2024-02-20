package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.Address;
import com.app.entities.Customer;
import java.lang.String;
import java.util.List;

@Repository
public interface CustomerDao  extends JpaRepository<Customer, Integer>{
	Customer findByEmail(String email);
	List<Customer> findByGender(String gender);
	
//	List<Customer> deleteByGender(String gender);
	
	@Modifying
    @Query ("DELETE FROM Customer c WHERE c.email = :email")
    void deleteByEmail(String email);
}
