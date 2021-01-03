package com.my.forme.mapper;

import java.util.List;

import com.my.forme.vo.UserVO;


public interface UserMapper {
	
	public int insertMember( UserVO vo );
	public List<UserVO> selectAllUser();
	
}
