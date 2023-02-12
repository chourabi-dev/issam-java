package com.example.demo.controllers;

import java.util.HashMap;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.collections.Book;
import com.example.demo.dto.BookModel;
import com.example.demo.services.*;

@RestController
@RequestMapping("/api/v1/books")
@CrossOrigin( value="*" )
public class BooksController {

	@Autowired
	private BooksService BooksService;
	
	ModelMapper mapper = new ModelMapper();
	
	
	// GET !!
	
	@GetMapping("/list")
	public ResponseEntity<?> getList(){
		
		List<Book> books = this.BooksService.getBooksRepository().findAll();
		
		return ResponseEntity.ok(books);
		
	}
	
	
	
	// POST
	@PostMapping("/add")
	public ResponseEntity<?> addBook( @RequestBody BookModel dto  ){
		
		// 1 create document !!
		
		/*Book book = new Book();
		
		
		book.setAuth( dto.getAuth() );*/ // old method
		
		
		
		// create the document and save it !!! 
		Book book = this.mapper.map(dto, Book.class); 
		
		// set my own ID
		//book.setId("121545216");
		
		
		return ResponseEntity.ok(this.BooksService.getBooksRepository().save(book));
		
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> addBook( @RequestBody BookModel dto, @PathVariable String id  ){
		
		// 1 create document !!
		
		/*Book book = new Book();
		
		
		book.setAuth( dto.getAuth() );*/ // old method
		
		
		
		// create the document and save it !!! 
		
		/*Book book = this.mapper.map(dto, Book.class);
		book.setId(id);*/
		
		
		Book book = this.BooksService.getBooksRepository().findById(id).get();
		
		book.setAuth(dto.getAuth());
		book.setCategory(dto.getCategory());
		book.setPages(dto.getPages());
		book.setName(dto.getName());
		
		this.BooksService.getBooksRepository().save(book);
		
		
		return ResponseEntity.ok(book);
		
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBook( @PathVariable String id  ){
		
		 
		Book book = this.BooksService.getBooksRepository().findById(id).get(); 
		
		this.BooksService.getBooksRepository().delete(book);
		
		HashMap<String,String> res = new HashMap<String,String>();
		
		res.put("message", "book deleted successfully");
		 
		
		return ResponseEntity.ok(res);
		
	}
}
