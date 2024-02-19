package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;
import com.app.entities.OrderDetail;
import com.app.entities.Customer;
import java.util.List;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer> {
	List<OrderDetail> findByCustomerId(Customer customerid);
}
