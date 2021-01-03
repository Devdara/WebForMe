package com.my.forme.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.my.forme.service.UserService;
import com.my.forme.vo.UserVO;

@Controller
public class UserController extends BaseController {

	@Autowired
	private UserService userService;
	
	// 회원목록 조회
	@RequestMapping(value = "/user/list", method = RequestMethod.GET )
	public ModelAndView list( HttpServletRequest request ) {
		
		log.info("Welcome /user/list" );
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userList", userService.selectAllUser() );
		
		log.info("" + userService.selectAllUser().size()  );
		
		mav.setViewName("/user/userList");
		
		return mav;
	}
	
	// 회원가입 페이지 이동
	@RequestMapping(value = "/user/join", method = RequestMethod.GET )
	public ModelAndView join( HttpServletRequest request ) {
		
		log.info("Welcome /user/join" );
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login/join");
		
		return mav;
	}
	
	// 회원가입처리
	@RequestMapping(value = "/insertUser.ajax", method = RequestMethod.POST )
	@ResponseBody
	public HashMap<String, Object> insertUser( HttpServletRequest request, UserVO userVO ){
		
		log.info("Welcome /user/insertUser.ajax" );
		
		// 회원사용여부값 설정
		userVO.setUseYn("Y");
		
		HashMap<String, Object> resMap = new HashMap<String, Object>(); 
		
		boolean result = userService.insertUser( userVO );
		resMap.put( "result", result );
		
		return resMap;
	}
	
}
