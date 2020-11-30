package com.law.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dto.Client_Profile;

@Controller
@RequestMapping("/Update")
public class UpdateController {

		@Autowired
		Client_ProfileDAO clientprofiledao;
		
	@RequestMapping(value="/{cid}/Client_profile",method=RequestMethod.GET)
	public ModelAndView showEditClientProfile(@PathVariable int cid) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("UserClickedUpdateClientProfile",true);
		mv.addObject("title","Updating Client Profile");
		Client_Profile client_Profile=clientprofiledao.get(cid);
		mv.addObject("clientProfile",client_Profile);
		System.out.println(client_Profile.toString());
		return mv;
	}
	
}
