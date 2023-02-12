package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.BooksRepository;

@Service
public class BooksService {

	
	@Autowired
	private BooksRepository booksRepository;

	public BooksRepository getBooksRepository() {
		return booksRepository;
	}
	
	
	
}
