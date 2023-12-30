package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {
	
    public Book addNewBook(Book b);

    public List<Book> getAllBook();
	
	public Book getBookById(int id);
	
	public Book UpdateBook(Book b);
	
	public void deleteBook(int id);


}