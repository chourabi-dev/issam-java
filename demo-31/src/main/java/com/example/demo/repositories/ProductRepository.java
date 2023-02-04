package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
	
	
	// first thing  one      many
	
	
	List<Product>  findByQuantity( int quantity );
	
	
	List<Product>  findByQuantityAndName( int quantity , String name );
	
	
	Product findByName( String name );
	
 
	

}
