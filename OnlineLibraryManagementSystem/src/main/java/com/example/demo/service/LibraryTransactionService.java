package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.LibraryTransaction;

public interface LibraryTransactionService {
	
	 public LibraryTransaction addNewLibraryTransaction(LibraryTransaction b);

	    public List<LibraryTransaction> getAllLibraryTransaction();
		
		public LibraryTransaction getLibraryTransactionById(int id);
		
		public LibraryTransaction UpdateLibraryTransaction(LibraryTransaction b);
		
		public void deleteLibraryTransaction(int id);


}
