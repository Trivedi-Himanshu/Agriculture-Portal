package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SellerDao;
import com.app.dto.SellerDTO;
import com.app.entities.Seller;

@Service
@Transactional
public class SellerService implements ISellerService{
	@Autowired
	private SellerDao dao;
	
	@Autowired
	private ModelMapper mapper;
	
	public Seller addSeller(SellerDTO dto) {
		
		Seller seller = mapper.map(dto, Seller.class);
		return dao.save(seller);
	}
	
	public Seller deleteByEmail(String email) {
//		return dao.deleteByEmail(email);
		return null;
	}
	
	public List<Seller> getAll(){
		return dao.findAll();
	}
	
	//this method will save the changes made to the oldSeller by showing the old data and saving the new data
	public Seller update(SellerDTO seller, String email) {  //update seller by email
		
		Seller oldSeller = dao.findByEmail(email);
		if(oldSeller == null) {
			return null;
		}
		
		dao.save(oldSeller);
		return null;
	}
	
}
