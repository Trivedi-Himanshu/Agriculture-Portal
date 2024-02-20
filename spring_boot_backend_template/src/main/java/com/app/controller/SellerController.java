//package com.app.controller;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.app.dto.SellerDTO;
//import com.app.entities.Product;
//import com.app.entities.Seller;
//import com.app.service.SellerService;
//
//@RestController
//@RequestMapping("/seller")
//public class SellerController {
//
//	@Autowired
//	private ModelMapper mapper;
//	
//	@Autowired
//	private SellerService service;
//	
//	@Autowired
//	private ProducService prodService;
//		
//	@PostMapping("/addnew")
//	public Seller addSeller(@RequestBody SellerDTO seller) {
//		return service.addSeller(seller);
//	}
//	
//	@PostMapping("/remove/")
//	public Seller addProduct(@RequestBody ProductDto dto) {
//		Product product = mapper.map(dto,Product.class);
//		product.setSellerId(seller);
//		return prodService.save(product);
//	}
//}
