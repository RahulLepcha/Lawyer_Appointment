package com.law.backend.dao;

import java.util.List;

import com.law.backend.dto.Profile;

public interface ProfileDAO {
	
	List<Profile> list();
	
	Profile get(int id);
	boolean add (Profile profile);
	boolean update (Profile profile);
	boolean delete (Profile profile);
	
}
