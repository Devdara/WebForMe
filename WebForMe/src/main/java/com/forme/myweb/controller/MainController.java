package com.forme.myweb.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController extends BaseController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET )
	public ModelAndView home(Locale locale, Model model) {
		
		log.info("Welcome home! The client locale is {}.", locale );
		
		ModelAndView mav = new ModelAndView();
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		mav.addObject("serverTime", formattedDate );
		mav.setViewName("/index");
		
		return mav;
	}
	
}
