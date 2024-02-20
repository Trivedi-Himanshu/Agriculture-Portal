package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Product;
import com.app.entities.Category;
import java.util.List;
import com.app.entities.Seller;

public interface ProductDao extends JpaRepository<Product, Integer> {

	List<Product> findByCategoryId(Category categoryId);
	List<Product> findBySellerId(Seller sellerId);

	
//	List<Product> deleteByOrderId(OrderDetail orderId);
	
	@Modifying
    @Query ("DELETE FROM Product p WHERE p.sellerId = :sid")
    void deleteBySellerId(int sid);
	
	
}
