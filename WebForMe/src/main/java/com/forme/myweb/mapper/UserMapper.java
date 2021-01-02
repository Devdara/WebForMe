package com.forme.myweb.mapper;

import java.util.List;

import com.forme.myweb.vo.UserVO;


public interface UserMapper {
	
	public int insertMember( UserVO vo );
	public List<UserVO> selectAllUser();
	
}
