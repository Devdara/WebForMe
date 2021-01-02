package com.forme.myweb.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController extends BaseController {
	
	@RequestMapping(value = "/board", method = RequestMethod.GET )
	public ModelAndView home(Locale locale, Model model) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/board/board");
		
		return mav;
	}
	
}
