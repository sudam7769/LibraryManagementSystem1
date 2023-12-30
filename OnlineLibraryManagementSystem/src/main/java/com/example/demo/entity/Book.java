package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	private int bookid;
	
//	@Column(name = "BookName", length = 30)
//	@NotEmpty(message = "Book Name can't be Empty.")
//	@Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//	@Size(min = 4, max = 30, message = "Minimum 4 and maximum 30 characters Allowed.")
	private String bookname;
	
//	@Column(name="BookAuthorName",length=20)
//	@NotEmpty(message="BookAuthorName is requred.")
//	@Pattern(regexp="^[a-zA-Z\\s]*$",message="Only Alphabets are Allowed ")
//	@Size(min=3,max=20,message="Minimum 3 and Maximum 20 Character Allowed")
	private String author;
	
//	@Column(name="BookDescription",length=100)
//	@NotEmpty(message = "Description is Required")
//	@Size(max = 100, message = "Please Enter Only Upto 100 characters.")
	private String description;
	
//	@Column(name="BookQuntityAvailable")
//	@NotEmpty(message = "Quantity Availablle can't be empty.")
//	@Min(value = 1, message = "Book Quantity must be at least 1.")
	private int quantityAvailable;
	
//	@NotEmpty(message = "Price can't be empty.")
	private int price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "category_id")
	 private Category category;

}