package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.serviceImpl.BookServiceImpl;
//import com.example.demo.serviceImpl.BookServiceImpl;




@RestController
public class BookController {
	@Autowired
	
	BookServiceImpl bookServiceImpl;
	
	@PostMapping("/books")
	public ResponseEntity<Object> addNewBook( @RequestBody Book b) {

		Book b1 = bookServiceImpl.addNewBook(b);
		return new ResponseEntity<>(b1, HttpStatus.OK);
	}

}