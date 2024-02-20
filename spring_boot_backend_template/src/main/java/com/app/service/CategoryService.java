package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.CategoryDao;
import com.app.dto.SellerDTO;
import com.app.entities.Category;
import com.app.entities.Product;

public class CategoryService implements ICategoryService{
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private CategoryDao dao;
	
	@Override
	public List<Category> findAll() {
		return dao.findAll();
	}

	@Override
	public Category addCategory(SellerDTO dto) {
		Category category = mapper.map(dto, Category.class);
		return dao.save(category);
	}
	
	
	
}
