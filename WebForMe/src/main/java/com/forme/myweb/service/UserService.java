package com.forme.myweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forme.myweb.mapper.UserMapper;
import com.forme.myweb.vo.UserVO;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	// 회원가입처리
	public boolean insertUser( UserVO userVO ) {
		
		int result = userMapper.insertMember(userVO);
		if( result > 0 ) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// 회원목록 조회
	public List<UserVO> selectAllUser() {
		
		return userMapper.selectAllUser();
	}
	
}
