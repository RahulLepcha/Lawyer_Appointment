package com.law.backend.dao;

import java.util.ArrayList;
import java.util.List;

import com.law.backend.dto.Court;

public interface CourtDAO {
	List<Court> list();

	Court get(int id);
	
	int getCrtId(String crtName);

	boolean add(Court court);

	boolean update(Court court);

	boolean delete(Court court);
	
	//Geting all the court names
	
	 ArrayList<String> getCrtNames();

}
