
package com.law.frontend.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.law.backend.dao.Case_HearingDAO;
import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dao.CourtDAO;
import com.law.backend.dao.Crt_CaseDAO;
import com.law.backend.dto.Case_Hearing;
import com.law.backend.dto.Client_Profile;
import com.law.backend.dto.Crt_Case;

@Controller
@RequestMapping("json/data")
public class JsonDataController {

	@Autowired
	private Client_ProfileDAO client_profiledao;
	private CourtDAO courtdao;
	
	@Autowired
	private Crt_CaseDAO CrtCase;
	
	@Autowired
	private Case_HearingDAO CaseHDA;
	@Autowired
	PageController cont;

	@RequestMapping("/all/{Lid}/clientnames")
	@ResponseBody
	public List<Client_Profile> getAllClientName(@PathVariable int Lid) {
		return client_profiledao.getAllClientName(Lid);
	}


	@RequestMapping("/client_Index/all")
	@ResponseBody
	public List<Client_Profile> getAllClientNames()
	{
		return client_profiledao.getAllClientNames();
	}

	@RequestMapping("/Case_Index/all")
	@ResponseBody
	public List<Crt_Case> getAllCourtCases()
	{
		return CrtCase.getAllCourtCases();
	}
	
	
	@RequestMapping("/Show_History/")
	@ResponseBody
	public List<Case_Hearing> getAllCourtCases1()
	{
		String id=cont.returnid();	
		return CaseHDA.getAllCourtCases(id);
			
	}
	
	@RequestMapping("/all/{Cid}/Case_I")
	@ResponseBody
	public List getAllCourtDetails(@PathVariable int Cid) {
		return CrtCase.getAllCourtDetails(Cid);
	}


}
