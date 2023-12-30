package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LibraryTransaction;
import com.example.demo.repository.LibraryTransactionRepository;
import com.example.demo.service.LibraryTransactionService;

@Service
public class LibraryTransactionServiceImpl implements LibraryTransactionService {
	
	@Autowired
	LibraryTransactionRepository libraryTransactionRepository;

	@Override
	public LibraryTransaction addNewLibraryTransaction(LibraryTransaction l) {
		// TODO Auto-generated method stub
		return libraryTransactionRepository.save(l);
	}

	@Override
	public List<LibraryTransaction> getAllLibraryTransaction() {
		// TODO Auto-generated method stub
		return libraryTransactionRepository.findAll();
		
	}

	@Override
	public LibraryTransaction getLibraryTransactionById(int id) {
		// TODO Auto-generated method stub
		return libraryTransactionRepository.findById(id).get();
		
	}

	@Override
	public LibraryTransaction UpdateLibraryTransaction(LibraryTransaction b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLibraryTransaction(int id) {
		// TODO Auto-generated method stub
		
	}

}
