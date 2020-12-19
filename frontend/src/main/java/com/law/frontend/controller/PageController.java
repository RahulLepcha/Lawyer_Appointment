package com.law.frontend.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
import com.law.backend.dto.Profile;

@Controller
public class PageController {

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
	
	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("pro", profileDA.list());
		mv.addObject("UserClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/aboutUs")
	public ModelAndView aboutUs() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("UserClickaboutUs", true);
		return mv;
	}

	@RequestMapping(value = "/forgotPassword")
	public ModelAndView forgotPassword() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "forgotPassword");
		mv.addObject("UserClickforgotPassword", true);
		return mv;
	}

	@RequestMapping(value = "/client_Index", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView client_Index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "client_Index");
		mv.addObject("UserClickclient_Index", true);
		System.out.println("Hi");

		if (request.getParameter("Search") == null) {
			// mv.addObject("Adding
			// values",clientprofiledao.SearchRecord(request.getParameter("Search")));
		} else {
			try {
				// Client_Profile l[]=
				// clientprofiledao.SearchRecord(request.getParameter("Search"));

				// System.out.println(l.toString());
				// mv.addObject("list",l);
			} catch (Exception e) {
				System.out.println("Line 95" + e);
			}
		}

		return mv;
	}
	
	@RequestMapping(value = "/client_2", method = { RequestMethod.POST })
	public String Client(@ModelAttribute("c2") Client_Profile profile) {
		if (profile.getLid() == 0) {
			profile.setLid(100);
			profile.setStatus(true);
			clientprofiledao.add(profile);

		} else {

			clientprofiledao.update(profile);

		}
		return "redirect:/client_Index";
	}
//	
//	 @RequestMapping(value = "/Case_I",method= {RequestMethod.POST})
//	 public String Case_I(@ModelAttribute("case") Crt_Case crtcase,@RequestParam("C_name") String Clientname,@RequestParam("Crt_name") String Crtname) {
//		
//		 crtcase.setCid(CrtCaseDA.getCid(Clientname));
//		 crtcase.setCrtid(CrtCaseDA.getCrtid(Crtname));
//		 CrtCaseDA.add(crtcase);
//			  
//			  return "redirect:/Case_I";
//		  }
//	
//	 @RequestMapping(value = "/Case_I",method= {RequestMethod.GET})
//	 @ResponseBody
//	 public ModelAndView Case_II(@ModelAttribute("case") Crt_Case crtcase) {
//		  ModelAndView mv = new ModelAndView("page");
//		  ArrayList<String> crtname; 
//		  crtname =  courtdao.getCrtNames();
//		  mv.addObject("crtNames",crtname); //for Adding client Names According to the userlogin id
//		  ArrayList<String> clientName; 
//		  clientName= (ArrayList<String>)clientprofiledao.getclientnames(97);
//	  	//for Adding Court Names 
//		  mv.addObject("clientNames", clientName); 
//		 mv.addObject("title", "Case Profile");
//		  mv.addObject("prop", "Update"); 
//		  mv.addObject("UserClickCase_I", true);
//		  mv.addObject("case",crtcase);
//		//  mv.addObject("case",case_Hearing);
//		  return mv; }
//	
	
	
	//making a new method for Case I jsp page
	
	@RequestMapping(value="/Case_I",method= {RequestMethod.GET})
	public ModelAndView Case_I(@ModelAttribute("Case1") Crt_Case crt_Case) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("Case1",crt_Case);
		
		crt_Case.setLid(148);
		crt_Case.setStatus(true);
		crt_Case.setCasePriority("on");
				mv.addObject("UserClickCase_I",true);
		return mv;
			}

	@RequestMapping(value="/Case_I",method= {RequestMethod.POST})
	public String Case_II(@ModelAttribute("Case1") Crt_Case crt_Case) {
	if(crt_Case.getCaseId()==0) {
		CrtCaseDA.add(crt_Case);
		Case_Hearing  crt_hear=new Case_Hearing();
		crt_hear.setAppointmentTime(crt_Case.getAppointmentTime());
		crt_hear.setBrief(crt_Case.getCaseBrief());
		crt_hear.setCaseuID(crt_Case.getCaseuID());
		crt_hear.setCaseIdate(crt_Case.getCaseIdate());
		crt_hear.setCasePdate(crt_Case.getCasePdate());
		crt_hear.setCid(crt_Case.getCid());
		crt_hear.setCrtid(crt_Case.getCrtid());
		crt_hear.setCaseuID(crt_Case.getCaseuID());
		crt_hear.setOppositionPartyName(crt_Case.getOppositionPartyName());
		crt_hear.setStage(crt_Case.getStage());
		crt_hear.setLid(crt_Case.getLid());
		crt_hear.setCaseNdate(crt_Case.getCaseNdate());
		crt_hear.setStatus(true);
		CaseHearingDA.add(crt_hear);
	}
	else
	{
		CrtCaseDA.update(crt_Case);
		Case_Hearing  crt_hear=new Case_Hearing();
		crt_hear.setAppointmentTime(crt_Case.getAppointmentTime());
		crt_hear.setBrief(crt_Case.getCaseBrief());
		crt_hear.setCaseuID(crt_Case.getCaseuID());
		crt_hear.setCaseIdate(crt_Case.getCaseIdate());
		crt_hear.setCasePdate(crt_Case.getCasePdate());
		crt_hear.setCid(crt_Case.getCid());
		crt_hear.setCrtid(crt_Case.getCrtid());
		crt_hear.setCaseuID(crt_Case.getCaseuID());
		crt_hear.setOppositionPartyName(crt_Case.getOppositionPartyName());
		crt_hear.setStage(crt_Case.getStage());
		crt_hear.setLid(crt_Case.getLid());
		crt_hear.setCaseNdate(crt_Case.getCaseNdate());
		crt_hear.setStatus(true);
		CaseHearingDA.add(crt_hear);
		
	}
	
		return "redirect:/Case_I";
	}

	//	
//	@RequestMapping(value = "/Case_Insert",method = {RequestMethod.POST})
//	@ResponseBody
//	public String Case_I(@ModelAttribute("case") Crt_Case crtcase) {
////		ModelAndView mv=new ModelAndView("page");
////		mv.addObject("title","Case Profile");
////		mv.addObject("prop", "New");
////		mv.addObject("UserClickCase_I",true);
////			
////		 crtcase.setCid(CrtCaseDA.getCid(Clientname));
////		 crtcase.setCrtid(CrtCaseDA.getCrtid(Crtname));
//		crtcase.setLid(129);
//		crtcase.setStatus("active");
//		System.out.println("in post case i");
//		
//		CrtCaseDA.add(crtcase);
//			  return "redirect:/Case_Index";
//		  }
//	
	@ModelAttribute("CourtName")
	public List<Court> getCourtdetails(){
		return courtdao.getCrtNames();
	}
	 
	@ModelAttribute("ClientName")
	public List<Client_Profile> getClientdetails(){
		return clientprofiledao.getAllClientNames();
	}

	@RequestMapping(value = "/signUp", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView signUp(@ModelAttribute("Profile") Profile p) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Sign Up");
		mv.addObject("UserClicksignUp", true);
		mv.addObject("Profile", p);
		return mv;
	}

	
	@RequestMapping(value = "/signUp", method = { RequestMethod.POST })
	public String signUpAdd(@ModelAttribute("Profile") Profile p) {
		p.setStatus(true);
        profileDA.add(p);
		return "redirect:/";

	}

	
	@RequestMapping(value = "/client_2", method = { RequestMethod.GET })
	@ResponseBody
	public ModelAndView Client2(@ModelAttribute("c2") Client_Profile profile) {
		System.out.println("Line 123");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Client Profile");
		mv.addObject("UserClickclient_I", true);
		mv.addObject("c2", profile);
		
		return mv;
	}
	
	@RequestMapping(value = "/index", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Client Profile");
		mv.addObject("UserClickindex", true);

		return mv;

	}

	
	 
		
	 @RequestMapping(value = "/Case_Index" ,method = { RequestMethod.POST, RequestMethod.GET })
	  public ModelAndView Case_Index(HttpServletRequest request, HttpServletResponse response) {
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "client_Index");
			mv.addObject("UserClickCase_Index", true);
			if (request.getParameter("Search") == null) {
				// mv.addObject("Adding
				// values",clientprofiledao.SearchRecord(request.getParameter("Search")));
			} else {
				try {
						
				} catch (Exception e) {
					System.out.println("Line 95" + e);
				}
			}

			return mv;
	 }
		 
	/*
	 * @RequestMapping(value = "/client_II") public ModelAndView clientUpdate() {
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title",
	 * "client_Add"); mv.addObject("prop", "Update");
	 * mv.addObject("UserClickclient_I", true); return mv; }
	 * 
	 * @RequestMapping(value = "/Case_Index") public ModelAndView Case_Index() {
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title",
	 * "Case_Index"); mv.addObject("UserClickCase_Index", true); return mv; }
	 * 
	 * 
	 * @RequestMapping(value = "/Case_I") public ModelAndView Case_I() {
	 * ModelAndView mv = new ModelAndView("page");
	 * 
	 * //for Adding Court Names ArrayList<String> crtname; crtname =
	 * (ArrayList<String>) courtdao.getCrtNames(); mv.addObject("crtNames",
	 * crtname); //for Adding client Names According to the userlogin id
	 * ArrayList<String> clientName; clientName=
	 * (ArrayList<String>)clientprofiledao.getclientnames(36);
	 * mv.addObject("clientNames", clientName); mv.addObject("title", "Case_Add");
	 * mv.addObject("prop", "Add New"); mv.addObject("UserClickCase_I", true);
	 * return mv; }
	 * 
	 * @RequestMapping(value = "/Case_II") public ModelAndView Case_Update() {
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title",
	 * "Case_Add"); mv.addObject("prop", "Update"); mv.addObject("UserClickCase_I",
	 * true); return mv; }
	 * 
	 * @RequestMapping(value = "/Court_Add") public ModelAndView Court_Add() {
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("title",
	 * "Court_Add"); mv.addObject("UserClickCourt_Add", true); return mv; } //
	 * // @RequestMapping(value="/test") // public ModelAndView
	 * test(@RequestParam(value="greeting",required=false)String greeting) { //
	 * if(greeting==null) { // greeting="hello there"; // } // ModelAndView mv=new
	 * ModelAndView("page"); //
	 * mv.addObject("greeting","Welcome To Law Appointment"); // return mv; // }
	 */
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		if (greeting == null) {
			greeting = "hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}

}
