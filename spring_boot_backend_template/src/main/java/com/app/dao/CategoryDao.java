package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Address;
import com.app.entities.Category;
import java.lang.String;
import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	
//	List<Category> findByCatName(String catname);
}
