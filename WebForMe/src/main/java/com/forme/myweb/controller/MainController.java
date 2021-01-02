package com.forme.myweb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController extends BaseController {
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public ModelAndView index( HttpServletRequest request, HttpServletResponse response, HttpSession session ) {
		
		log.info("Welcome /" );
		
		ModelAndView mav = new ModelAndView();
		
		Date now = new Date();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm:ss");
		
		mav.addObject("serverTime", sdFormat.format(now) );
		mav.setViewName("/main");
		
		return mav;
	}
	
}

