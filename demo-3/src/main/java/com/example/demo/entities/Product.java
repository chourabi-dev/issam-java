package com.example.demo.entities;


import java.time.LocalDateTime;

import jakarta.persistence.*;

 

@Entity
@Table( name="products" )
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	
	@Column( name="product_name", nullable=false )
	private String name;
	
	
	@Column( name="product_price", nullable=false )
	private float price;
	

	@Column( name="product_quantity", nullable=false )
	private int quantity;
	
	
	@Column( name="product_created_at", nullable=false )
	private LocalDateTime createdAt = LocalDateTime.now();


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public float getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public Product(long id, String name, float price, int quantity, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.createdAt = createdAt;
	}


	public Product() {
		super();
	}
	
	
	
	

}
