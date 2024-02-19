package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;
import com.app.entities.Product;
import com.app.entities.Category;
import java.util.List;
import com.app.entities.Seller;
import com.app.entities.OrderDetail;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product> findByCategoryId(Category categoryid);
	List<Product> findBySellerId(Seller sellerid);
	List<Product> findByOrderId(OrderDetail orderid);
}
