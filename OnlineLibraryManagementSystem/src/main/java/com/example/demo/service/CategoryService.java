package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Category;

public interface CategoryService {
	
	 public Category addNewCategory(Category b);

	    public List<Category> getAllCategory();
		
		public Category getCategoryById(int id);
		
		

}