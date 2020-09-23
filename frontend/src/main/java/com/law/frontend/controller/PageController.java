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
	@RequestMapping(value= "/signUp")
	public ModelAndView signUp() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Sign Up");
		mv.addObject("UserClicksignUp",true);
		return mv;
	}
	
	@RequestMapping(value= "/aboutUs")
	public ModelAndView aboutUs() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("UserClickaboutUs",true);
		return mv;
	}
	@RequestMapping(value= "/forgotPassword")
	public ModelAndView forgotPassword() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","forgotPassword");
		mv.addObject("UserClickforgotPassword",true);
		return mv;
	}

	@RequestMapping(value= "/client_Index")
	public ModelAndView client_Index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","client_Index");
		mv.addObject("UserClickclient_Index",true);
		return mv;
	}

	@RequestMapping(value= "/client_I")
	public ModelAndView client() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","client_Add");
		mv.addObject("prop","Add New");
		mv.addObject("UserClickclient_I",true);
		return mv;
	}

	@RequestMapping(value= "/client_II")
	public ModelAndView clientUpdate() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","client_Add");
		mv.addObject("prop","Update");
		mv.addObject("UserClickclient_I",true);
		return mv;
	}
	
	@RequestMapping(value= "/Case_Index")
	public ModelAndView Case_Index() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Case_Index");
		mv.addObject("UserClickCase_Index",true);
		return mv;
	}

	@RequestMapping(value= "/Case_I")
	public ModelAndView Case_I() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Case_Add");
		mv.addObject("prop","Add New");
		mv.addObject("UserClickCase_I",true);
		return mv;
	}


	@RequestMapping(value= "/Case_II")
	public ModelAndView Case_Update() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Case_Add");
		mv.addObject("prop","Update");
		mv.addObject("UserClickCase_I",true);
		return mv;
	}

	@RequestMapping(value= "/Court_Add")
	public ModelAndView Court_Add() {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Court_Add");
		mv.addObject("UserClickCourt_Add",true);
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
