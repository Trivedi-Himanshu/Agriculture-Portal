package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.app.entities.OrderDetail;
import com.app.entities.Seller;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
	private String pNname;
	
	private String Category_id;
	
	private double price;
	
	private Byte[] image;
	
	private LocalDate manufacteDate;
	
	private String description;
	
	private OrderDetail orderId;
	
	private Seller sellerId;
	
}
