package com.law.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.law.backend.dao.Case_HearingDAO;
import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dao.CourtDAO;
import com.law.backend.dao.Crt_CaseDAO;
import com.law.backend.dao.ProfileDAO;
import com.law.backend.dto.Case_Hearing;
import com.law.backend.dto.Client_Profile;
import com.law.backend.dto.Court;
import com.law.backend.dto.Crt_Case;

@Controller
@RequestMapping("/Update")
public class UpdateController {

	@Autowired
	private ProfileDAO profileDA;

	@Autowired
	private CourtDAO courtdao;

	@Autowired
	private Client_ProfileDAO clientprofiledao;

	@Autowired
	private Crt_CaseDAO CrtCaseDA;
	
	@Autowired
	private Case_HearingDAO CaseHearingDA;

		/*@RequestMapping(value="/Client_profile",method=RequestMethod.GET)
		public ModelAndView showClientProfile(@PathVariable int cid) {
			ModelAndView mv=new ModelAndView("page");
			mv.addObject("UserClickedUpdateClientProfile",true);
			mv.addObject("title","Updating Client Profile");
			Client_Profile client_Profile=clientprofiledao.get(cid);
			mv.addObject("clientProfile",client_Profile);
			System.out.println(client_Profile.toString());
			return mv;
		}
		*/
		 
//		@RequestMapping(value = "/client_2",method= {RequestMethod.POST})
//			public String Client(@ModelAttribute("c2") Client_Profile profile) {
//			System.out.println("1Line 34"); 
//			clientprofiledao.update(profile);
//		    	return "redirect:/client_Index";
//			}
//			
//		 

		    @RequestMapping(value = "/{id}/client_2",method= {RequestMethod.GET})
			@ResponseBody
			public ModelAndView Client2(@PathVariable int id) {
		    	System.out.println("1Line 45"); 
				
		    	ModelAndView mv = new ModelAndView("page");
				mv.addObject("title", "Client Profile");
				mv.addObject("UserClickclient_I", true);
				Client_Profile cprofile=clientprofiledao.get(id);
				
				mv.addObject("c2",cprofile);
				cprofile.toString();
				 	
				
		    	return mv;
			}

		    @ModelAttribute("CourtName")
			public List<Court> getCourtdetails(){
				return courtdao.getCrtNames();
			}
			 
			@ModelAttribute("ClientName")
			public List<Client_Profile> getClientdetails(){
				return clientprofiledao.getAllClientNames();
			}

		    @RequestMapping(value = "/{id}/Case_I",method= {RequestMethod.GET})
		 			@ResponseBody
		 			public ModelAndView Case2(@PathVariable int id) {
		 		    	System.out.println("1Line 45"); 
		 		    	ModelAndView mv = new ModelAndView("page");
		 				mv.addObject("title", "Client Profile");
		 				mv.addObject("UserClickCase_I", true);
						Crt_Case cprofile=CrtCaseDA.get(id);
						mv.addObject("Cid", cprofile.getCid());
		 				mv.addObject("Case1",cprofile);
		 				cprofile.toString();
		 					
		 		    	return mv;
		 			}


		  

		
		/* 
	@RequestMapping(value="/{cid}/Client_profile",method=RequestMethod.GET)
	public ModelAndView showEditClientProfile(@PathVariable int cid) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("UserClickedUpdateClientProfile",true);
		mv.addObject("title","Updating Client Profile");
		Client_Profile client_Profile=clientprofiledao.get(cid);
		mv.addObject("clientProfile",client_Profile);
		System.out.println(client_Profile.toString());
		return mv;
	}*/
	
}
