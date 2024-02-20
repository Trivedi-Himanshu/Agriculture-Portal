package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.CustomerDao;
import com.app.dao.FeedbackDao;
import com.app.dto.FeedbackDTO;
import com.app.entities.Customer;
import com.app.entities.Feedback;
import com.app.entities.Product;

public class FeedbackService implements IFeedbackService{

	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private FeedbackDao dao;
	
	
	
	@Override
	public List<Feedback> getByProduct(int prodId) {
		return dao.findByProductId(prodId);
	}

	@Override
	public List<Feedback> getByCustomer(int custId) {
		return dao.findByCustomerId(custId);
	}

	@Override
	public void deleteByCust(Integer Custid) {
		dao.deleteByCustId(Custid);
	}

	@Override
	public Feedback setFeedback(FeedbackDTO dto) {
		Feedback feedback = mapper.map(dto, Feedback.class);
		return dao.save(feedback);
	}
	
}
