package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Address;
import com.app.entities.OrderDetail;
import com.app.entities.Customer;
import java.util.List;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer> {
	List<OrderDetail> findByCustomerId(int customerId);
	
	List<OrderDetail> deleteByCustomerId(int customerId);
	
//	@Modifying
//    @Query ("DELETE FROM OderDetail o WHERE o.customerId = :custid")
//    void deleteByCustId(Integer custid);
}
