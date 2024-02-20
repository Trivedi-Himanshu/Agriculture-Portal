package com.app.service;

import java.util.List;

import com.app.dto.SellerDTO;
import com.app.entities.Category;
import com.app.entities.Product;

public interface ICategoryService {
	
	List<Category> findAll();
	
	Category addCategory(SellerDTO dto);
	
}
