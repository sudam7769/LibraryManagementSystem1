package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberRepository memberRepository;

	@Override
	public Member addNewMember(Member m) {
		// TODO Auto-generated method stub
		return memberRepository.save(m);
	}

	@Override
	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
		
	}

	@Override
	public Member getMemberById(int id) {
		// TODO Auto-generated method stub
		return memberRepository.findById(id).get();
		
	}

	@Override
	public Member UpdateMember(Member b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(int id) {
		// TODO Auto-generated method stub
		
	}

}
