package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDTO;
import com.app.entities.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins="http://localhost:8080")

public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	public List<CustomerDTO> findAll(){
		return customerService.findAll();
	}
	
	@GetMapping("/byEmail")
	public CustomerDTO findByEmail(String email) {
		return customerService.findByEmail(email);
	}
	
	@PostMapping("/addCustomer")
	public boolean addCustomer(@RequestBody CustomerDTO dto) {
		boolean flag = false;
		customerService.addCustomer(dto);
		flag = true;
		return flag;
	}
}



//
//@RestController
//@RequestMapping("/customer")
//public class CustomerController {
//	@Autowired
//	CustomerService customerService;
//	
//	public CustomerController()
//	{
//		System.out.println("in ctor of "+ getClass());
//	}
//	
//	@GetMapping
//	public List<Integer> testMe()
//	{
//		System.out.println("in test me");
//		return List.of(1,2,3,4,5);
//		
//	}
//}
