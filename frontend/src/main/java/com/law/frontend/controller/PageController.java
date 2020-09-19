package com.law.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
		@RequestMapping(value= {"/","/index","/home"})
		public ModelAndView index() {
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("title","Home");
			mv.addObject("UserClickHome",true);
			return mv;
		}
//
//		@RequestMapping(value="/test")
//		public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
//			if(greeting==null) {
//				greeting="hello there";
//			}
//			ModelAndView mv=new ModelAndView("page");
//			mv.addObject("greeting","Welcome To Law Appointment");
//			return mv;
//		}

		@RequestMapping(value="/test/{greeting}")
		public ModelAndView test(@PathVariable("greeting")String greeting) {
			if(greeting==null) {
				greeting="hello there";
			}
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("greeting",greeting);
			return mv;
		}

}
