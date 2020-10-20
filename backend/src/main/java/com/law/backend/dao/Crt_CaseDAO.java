package com.law.backend.dao;

import java.util.List;

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
}
