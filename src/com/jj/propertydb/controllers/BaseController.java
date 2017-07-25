package com.jj.propertydb.controllers;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class BaseController {

	//static Logger log = Logger.getLogger(BaseController.class.getName());

	@RequestMapping(value = "/mainPage", method = RequestMethod.GET)
	public ModelAndView index() {
		System.out.println("Initializing PropertyDB");
		//log.info("Initializing PropertyDB");
		return new ModelAndView("main.page");
	}
}