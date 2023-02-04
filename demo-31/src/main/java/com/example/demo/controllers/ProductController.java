package com.example.demo.controllers;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductModel;
import com.example.demo.entities.Product;
import com.example.demo.models.ApiResponse;
import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/list")
	public ResponseEntity<?> getList(){
		return ResponseEntity.ok(this.productService.getProductRepository().findAll());
	}
	
	// INSERT !!!
	
	@PostMapping("/add")
	public ResponseEntity<?> add(  @RequestBody ProductModel data  ){
		
		
		// 1 CREATE ENTITY !!
		Product p = new Product();
		
		p.setName(data.getProduct_name());
		p.setPrice(data.getProduct_price());
		p.setQuantity(data.getProduct_quantity());
		
		
		ApiResponse res;
		
		if( data.getProduct_name().length() <=3 ) {
			res = new ApiResponse(false,"product name is too short");	
		}else {
			
			// 2 SAVE ENTITY !!
			this.productService.getProductRepository().save(p);
			
			// 3 LET THE USER KNOW THAT THE DATA IS SAVED !!!
			
			 res = new ApiResponse(true,"product inserted successfully");
		}
		
		return ResponseEntity.ok(  res  );
	}
	
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update( @PathVariable long id,  @RequestBody ProductModel data  ){
		
		try {
			// GO FIND THE OLD ENTITY !!
			Product p = this.productService.getProductRepository().findById(id).get();
			
			// update
			p.setName(data.getProduct_name());
			p.setPrice(data.getProduct_price());
			p.setQuantity(data.getProduct_quantity());
			
			// save
			this.productService.getProductRepository().save(p);
			ApiResponse res;
			res = new ApiResponse(true,"product updated successfully");
			return ResponseEntity.ok(  res  );
			
			
		}catch( NoSuchElementException e) {
			ApiResponse res;
			res = new ApiResponse(false,"product not found");
			return ResponseEntity.status(404).body(  res  );
			
				
		}catch(Exception e) {
			ApiResponse res;
			res = new ApiResponse(false,"something went wrong.");
			return ResponseEntity.status(401).body(  res  );
			
		} 
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> update( @PathVariable long id  ){
		
		try {
			// GO FIND THE OLD ENTITY !!
			Product p = this.productService.getProductRepository().findById(id).get();
			
		 
			
			// delete
			this.productService.getProductRepository().delete(p);
			ApiResponse res;
			res = new ApiResponse(true,"product deleted successfully");
			return ResponseEntity.ok(  res  );
			
			
		}catch( NoSuchElementException e) {
			ApiResponse res;
			res = new ApiResponse(false,"product not found");
			return ResponseEntity.status(404).body(  res  );
			
				
		}catch(Exception e) {
			ApiResponse res;
			res = new ApiResponse(false,"something went wrong.");
			return ResponseEntity.status(401).body(  res  );
			
		} 
	}
	
	
	
	
	@GetMapping("/list/out-of-stock")
	public ResponseEntity<?> outOfStock(){
		return ResponseEntity.ok(this.productService.getProductRepository().findByQuantity(0) );
	}
	
	
	
}
