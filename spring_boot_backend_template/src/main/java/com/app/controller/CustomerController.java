package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDTO;
import com.app.entities.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
//@CrossOrigin(origins="http://localhost:8080")
@CrossOrigin

public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	
//	public ResponseEntity<?> findAllCustomers() {
//		List<Customer> result = customerService.findAllCustomers();
//		return Response.success(result);
//	}
	
//	public ResponseEntity<?> getEmpDetailsByDepartment(@PathVariable Long deptId) throws IOException {
//		System.out.println("get emps by dept "+deptId);
//		return ResponseEntity.ok(employeeService.getAllEmployeesFromDept(deptId));
//	}
	
	@GetMapping("/all")
	public ResponseEntity<?> findAll(){
//		List<CustomerDTO> result = customerService.findAll();
		return ResponseEntity.ok(customerService.findAll());
	}
	
	@GetMapping("/byEmail")
	public CustomerDTO findByEmail(String email) {
		return customerService.findByEmail(email);
	}
	
	@PostMapping("/addCustomer")
	public boolean addCustomer( CustomerDTO dto) {
		boolean flag = false;
		customerService.addCustomer(dto);
		flag = true;
		return flag;
	}
	
	@PutMapping("/update")
	public CustomerDTO update(CustomerDTO dto, String email) {
		return customerService.update(dto, email);
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
