package com.app.service;

import java.util.List;

import com.app.dto.FeedbackDTO;
import com.app.entities.Feedback;

public interface IFeedbackService {
	
	Feedback setFeedback(FeedbackDTO dto);
	
	List<Feedback> getByProduct(int prodId);
	
	List<Feedback> getByCustomer(int custId);
	
	void deleteByCust(Integer Custid);
}
