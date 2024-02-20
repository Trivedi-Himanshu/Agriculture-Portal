package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Address;
import com.app.entities.Feedback;
import com.app.entities.Customer;
import java.util.List;
import com.app.entities.Product;

public interface FeedbackDao  extends JpaRepository<Feedback, Integer>{
	List<Feedback> findByCustomerId(int customerid);
	
	List<Feedback> findByProductId(int productid);
//	List<Feedback> deleteByCustomerId(Customer customerid);
	@Modifying
    @Query ("DELETE FROM Feedback f WHERE f.customerId = :custid")
    void deleteByCustId(Integer custid);
}
