package com.law.backend.dao;

import java.util.List;

import com.law.backend.dto.Case_Hearing;

public interface Case_HearingDAO {
	

	List<Case_Hearing> list();

	
	Case_Hearing get(int id);
	boolean add (Case_Hearing case_Hearing);
	boolean update (Case_Hearing case_Hearing);
	boolean delete (Case_Hearing case_Hearing);

}
