package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LibraryTransaction;

public interface LibraryTransactionRepository extends JpaRepository<LibraryTransaction,Integer> {

}
