
package com.law.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dao.CourtDAO;
import com.law.backend.dto.Client_Profile;

@Controller
@RequestMapping("json/data")
public class JsonDataController {

	@Autowired
	private Client_ProfileDAO client_profiledao;
	private CourtDAO courtdao;

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
	
	

}
