package com.my.forme.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET )
	public ModelAndView home(Locale locale, Model model) {
		
		log.info("Welcome /login" );
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login/login");
		
		return mav;
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST )
	public ModelAndView loginProcess(Locale locale, Model model) {
		
		log.info("Welcome /loginProcess" );
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main");
		
		return mav;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET )
	public ModelAndView join(Locale locale, Model model) {
		
		log.info("Welcome /join" );
		
		ModelAndView mav = new ModelAndView();
		
		
		
		mav.setViewName("/login/join");
		
		return mav;
	}
	
}
