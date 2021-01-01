package com.forme.myweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forme.myweb.mapper.MemberMapper;
import com.forme.myweb.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public void insertMember() {
		
		MemberVO mvo = new MemberVO();
		mvo.setName("A");
		memberMapper.insertMember( mvo );
		
	}
	
}
