package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LibraryTransaction;
import com.example.demo.serviceImpl.LibraryTransactionServiceImpl;
//import com.example.demo.serviceImpl.LibraryTransactionServiceImpl;



@RestController
public class LibraryTransactionController {
        @Autowired
        
		LibraryTransactionServiceImpl libraryTransactionServiceImpl;
		
		@PostMapping("/libraryTransaction")
		public ResponseEntity<Object> addNewLibraryTransaction( @RequestBody LibraryTransaction l) {

			LibraryTransaction l1 = libraryTransactionServiceImpl.addNewLibraryTransaction(l);
			return new ResponseEntity<>(l1, HttpStatus.OK);
		}

	}

