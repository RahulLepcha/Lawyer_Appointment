package com.law.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dao.CourtDAO;
import com.law.backend.dao.ProfileDAO;
import com.law.backend.dto.Profile;

@Controller
//@RequestMapping("/logcheck1")
public class SecurityCheckController {
	
	@Autowired
	private ProfileDAO profileDAO;
	
	@Autowired
	private CourtDAO courtdao;
	
	@Autowired
	private Client_ProfileDAO clientprofiledao;
	
//	
//	
//	@RequestMapping(value="logincheck",method=RequestMethod.GET)
//	public ModelAndView initcheck() {
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("/logincheck",new Profile());
//		return mv;
//	}
//	//handling Login check
//	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public ModelAndView loginCheck(@ModelAttribute("logincheck") Profile mprofile) {
//		int Uid=0;
//		Uid=profileDAO.logincheck(mprofile);
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("LoginId",Uid);
//		return mv;
//	}
}
