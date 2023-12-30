package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService {
	
	public Member addNewMember(Member b);

    public List<Member> getAllMember();
	
	public Member getMemberById(int id);
	
	public Member UpdateMember(Member b);
	
	public void deleteMember(int id);



}