package com.law.backend.dao;

import java.util.ArrayList;
import java.util.List;

import com.law.backend.dto.Case_Hearing;
import com.law.backend.dto.Client_Profile;
import com.law.backend.dto.Crt_Case;

public interface Crt_CaseDAO {

	List<Crt_Case> list();

	
	Crt_Case get(int id);
	boolean add (Crt_Case crt_Case);
	boolean update (Crt_Case crt_Case);
	boolean delete (Crt_Case crt_Case);
	int getUid(String UserEmail);
	int getCid(String ClientName);
	int getCrtid(String CourtName);


	
	
	List getAllCourtDetails(int id);


	List<Crt_Case> getAllCourtCases();


	List<Client_Profile> getAllCourtcase(int lid);


	ArrayList<String> getAllCourtcase();
}
