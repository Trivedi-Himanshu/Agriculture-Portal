package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.OrderInfo;
import com.app.entities.Customer;
import java.util.List;

public interface OrderInfoDao extends JpaRepository<OrderInfo, Integer> {
	List<OrderInfo> findByCustomerId(Customer customerid);
	
//	@Modifying
//    @Query ("DELETE FROM OderDetail o WHERE o.customerId = :custid")
//    void deleteByCustId(Integer custid);
}
