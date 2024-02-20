package com.app.service;

import java.util.List;

import com.app.dto.SellerDTO;
import com.app.entities.Seller;

public interface ISellerService {

	public Seller addSeller(SellerDTO dto);
	
	public Seller deleteByEmail(String email);
	
	public List<Seller> getAll();
	
	//this method will save the changes made to the oldSeller by showing the old data and saving the new data
	public Seller update(SellerDTO seller, String email);
}
