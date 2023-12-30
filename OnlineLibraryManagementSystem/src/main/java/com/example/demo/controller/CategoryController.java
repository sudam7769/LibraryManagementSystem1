package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.serviceImpl.CategoryServiceImpl;
//import com.example.demo.CategoryserviceImpl.CategoryServiceImpl;

//import jakarta.validation.Valid;

@RestController
public class CategoryController {
	@Autowired
	CategoryServiceImpl categoryserviceImpl;
	
	@PostMapping("/category")
	public ResponseEntity<Object> addNewCategory( @RequestBody Category c) {

		Category c1 = categoryserviceImpl.addNewCategory(c);
		return new ResponseEntity<>(c1, HttpStatus.OK);
	}

}

