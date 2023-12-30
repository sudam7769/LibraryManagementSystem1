package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
//import jakarta.validation.constraints.Email;
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
public class Member {
	@Id
	private int mid;
	
//	@Column(name="Member Name",length=20)
//	@NotEmpty(message="Member Name is required.")
//	@Size(min=3,max=20,message="Minumun 3 and Maximum 20 Character is Allowed.")
//	@Pattern(regexp="^[a-zA-Z0-9\s]*$",message="Only Alphabates and Numeric values are requred. ")
	private String mname;
	
//	@Column(name="Member Contact",length=10)
//	@NotEmpty(message="Member Contact is required.")
//	@Size(max=10,message=" Maximum 10 value is Allowed.")
//	@Pattern(regexp="^[0-9\s]*$",message="Only Numeric values are Allowed. ")
	private String mcontact;
//	
//	@Column(name="Member Email")
//	@Email(message="Please Provide an mail")
//	@NotEmpty(message="Member Email is required.")
	private String memail;
	
//	@Column(name="Member Address",length=40)
//	@NotEmpty(message="Member Address is required.")
//	@Size(min=3,max=30,message="Minumun 3 and Maximum 30 Character is Allowed.")
//	@Pattern(regexp="^[a-zA-Z0-9\s]*$",message="Only Alphabates and Numeric values are requred. ")
	private String maddress;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<LibraryTransaction> libraryTransaction=new ArrayList<LibraryTransaction>();

}

