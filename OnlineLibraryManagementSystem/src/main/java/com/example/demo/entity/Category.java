package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	@Id
	private int category_id;
	
//	@Column(name="CategoryName",length=20)
//	@NotEmpty(message="CategoryName can't be Empty")
//	@Size(min=3,max=20,message="Minimum 3 and Maximum 20 character are Allowed.")
//	@Pattern(regexp="^[a-zA-Z\s]*$",message="Only Alphabates are Allowed.")
    private String name;
	
//	@Column(name="CategoryLanguage",length=10)
//	@NotEmpty(message=" Language of book is requred.")
//	@Size(min=3,max=10,message="Minimum 3 and Maximum 20 character are Allowed.")
//	@Pattern(regexp="^[a-zA-Z\s]*$",message="Only Alphabates are Allowed.")
    private String language;
	
//	@Column(name = "agegroup", length = 21)
//	@NotNull(message = "Mention the Age-Group of the Book.")
//	@Size(min = 3, max = 20, message = "Minimum 3 and maximum 20 characters allowed.")
//	@Pattern(regexp = "^[a-zA-z0-9\\s]+$", message = "Only Alphabets and Numeric values are allowed.")
    private String agegroup;
	
	   // Relation with books 
		@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
		@JsonIgnore
		private List<Book> books=new ArrayList<Book>();

}

