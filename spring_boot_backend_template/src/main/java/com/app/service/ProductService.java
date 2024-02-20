package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.ProductDao;
import com.app.dao.SellerDao;
import com.app.entities.Product;
import com.app.entities.Seller;

@Repository
@Transactional
public class ProductService implements IProductService{
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private ProductDao dao;
	
	@Autowired 
	private SellerDao sDao;
	
	@Override
	public Product addProduct(Product p) {
//		Seller seller = sDao.findById(p.getSellerId());
//		if(seller != null) {
//			dao.save(p);
//		}
		return null;
	}
	
	@Override
	public Product delProduct(Product p) {
		return null;
	}
	
	@Override
	public Product updateProduct(Product p, int pid) {
		return null;
	}
	
	@Override
	public List<Product> getAllProd(){
		return null;
	}
}
