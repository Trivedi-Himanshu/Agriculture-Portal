package com.app.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Category extends BaseEntity{
	//	SEED, MACHINARY, FERTILIZERS, CROPS, FLOWERS
	@Column(name = "Category_name", nullable = false, unique = true)
	private String name; 
}
