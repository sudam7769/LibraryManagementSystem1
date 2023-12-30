package com.example.demo.entity;

import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class LibraryTransaction {
	@Id
	private int bookid;
	private int mid;
	private int tid;
	
//	@Column(name = "Borrow Date", length = 20)
//	@NotEmpty(message = "Borrow Date can't be Empty.")
//	@Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//	@Size(min = 4, max = 30, message = "Minimum 4 and maximum 30 characters Allowed.")
	private String borrowDate;
	
//	@Column(name = "Return Date", length = 20)
//	@NotEmpty(message = "Return Date can't be Empty.")
//	@Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Only Alphabets and Numeric Values are Allowed.")
//	@Size(min = 4, max = 30, message = "Minimum 4 and maximum 30 characters Allowed.")
	private String returnDate;
//	
//    @Column(name="number_of_days")
//    @NotEmpty(message="number_of_days can't be Empty.")
    private int numberOfDays;
//    @Column(name="finePerDay")
//    @NotEmpty(message="finePerDay can't be Empty.")
    private double finePerDay;
    
        @ManyToOne(cascade=CascadeType.ALL)
    	@JoinColumn(name="member_id")
    	private Member member;
    	
    	@ManyToOne(cascade=CascadeType.ALL)
    	@JoinColumn(name="book_id")
        private Book book;
	
	

}