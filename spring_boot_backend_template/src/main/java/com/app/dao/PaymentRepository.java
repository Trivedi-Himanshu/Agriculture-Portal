package com.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.Agriculture.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
