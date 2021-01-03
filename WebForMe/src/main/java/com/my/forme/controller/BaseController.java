package com.my.forme.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.my.forme.common.LoginSessionVo;

@Controller
public class BaseController {

	protected final Logger log = LoggerFactory.getLogger( this.getClass() );
	
	@ModelAttribute("loginSessionVo")
	protected LoginSessionVo getLoginSession( HttpServletRequest request ) {
		return null;
	}
}
