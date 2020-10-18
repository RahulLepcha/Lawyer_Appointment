package com.law.backend.dao;

import java.util.List;

import com.law.backend.dto.Client_Profile;

public interface Client_ProfileDAO {
	
	List<Client_Profile> list();

	
	Client_Profile get(int id);
	int getUid(String userEmail);
	boolean add (Client_Profile client_Profile);
	boolean update (Client_Profile client_Profile);
	boolean delete (Client_Profile client_Profile);
	
}
