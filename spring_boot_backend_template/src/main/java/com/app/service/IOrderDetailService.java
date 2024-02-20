package com.app.service;

import java.util.List;

import javax.persistence.criteria.Order;

public interface IOrderDetailService {
	
	List<Order> findByCust(int custId);
	
	List<Order> deleteByCust(int custId);
}
