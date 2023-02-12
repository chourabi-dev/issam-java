package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.collections.Book;

public interface BooksRepository extends MongoRepository<Book,String> {

}
