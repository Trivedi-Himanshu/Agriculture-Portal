package com.app.service;

import java.util.List;

import com.app.entities.Product;

public interface IProductService {
	
	public Product addProduct(Product p);
	
	public Product delProduct(Product p);
	
	public Product updateProduct(Product p, int pid);
	
	public List<Product> getAllProd();
}
