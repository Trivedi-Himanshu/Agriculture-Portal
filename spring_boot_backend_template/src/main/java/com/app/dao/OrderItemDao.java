package com.app.dao;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.OrderItem;
import com.app.entities.OrderInfo;
import java.util.List;

public interface OrderItemDao extends JpaRepository<OrderItem, Integer>{
	
	List<OrderItem> findByOrderInfoId(OrderInfo orderinfoid);
	
//	@Modifying
//	@Query("SELECT FROM OrderItem o WHERE orderInfoId = :orderId")
//	void deleteByOrderItemId(int orderId);
}
