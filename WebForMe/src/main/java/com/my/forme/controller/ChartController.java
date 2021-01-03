package com.my.forme.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChartController extends BaseController {
	
	@RequestMapping(value = "/chart", method = RequestMethod.GET )
	public ModelAndView home(Locale locale, Model model) {
		
		log.info("Welcome /chart" );
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/chart/charts");
		
		return mav;
	}
	
}
