package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.PaymentDao;
import com.app.entities.Payment;

public class PaymentService implements IPaymentService{

	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private PaymentDao dao;
	
	@Override
	public List<Payment> findByCustId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findByCardNo(long cardno) {
		// TODO Auto-generated method stub
		return null;
	}

}
