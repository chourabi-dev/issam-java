package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ProductService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/list")
	public ResponseEntity<?> getList(){
		return ResponseEntity.ok(this.productService.getCategoryRepository().findAll());
	}
}
