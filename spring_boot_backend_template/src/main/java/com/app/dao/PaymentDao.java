package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;
import com.app.entities.Payment;
import com.app.entities.Customer;
import java.util.List;

public interface PaymentDao extends JpaRepository<Payment, Integer> {
	List<Payment> findByCustomerId(int customerid);
	
	List<Payment> findByCardNo(long cardno);
}
