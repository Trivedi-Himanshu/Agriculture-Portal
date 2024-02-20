package com.app.service;

import java.util.List;

import com.app.entities.Payment;

public interface IPaymentService {
		
	List<Payment> findByCustId(int custId);
	
	List<Payment> findByCardNo(long cardno);
}
