package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Category;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Book addNewBook(Book b) {
		// TODO Auto-generated method stub
		Category c1 = categoryRepository.findById(b.getBookid()).get();
		b.setCategory(c1);
		return bookRepository.save(b);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
//		 return bookRepository.findAll();
		return null;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
//		return bookRepository.findById(id).get();
		return null;
	}

	@Override
	public Book UpdateBook(Book b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}

}

