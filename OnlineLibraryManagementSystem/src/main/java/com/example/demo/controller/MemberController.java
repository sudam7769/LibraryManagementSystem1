package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.serviceImpl.MemberServiceImpl;
//import com.example.demo.serviceImpl.MemberServiceImpl;




@RestController
public class MemberController {
	
        @Autowired
        MemberServiceImpl memberServiceImpl;
		
		@PostMapping("/member")
		public ResponseEntity<Object> addNewMember( @RequestBody Member m) {

			Member m1 = memberServiceImpl.addNewMember(m);
			return new ResponseEntity<>(m1, HttpStatus.OK);
		}

	}
