package com.law.backend.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.law.backend.dto.Profile;

public interface ProfileDAO {
	
	List<Profile> list();
	
	Profile get(int id);
	boolean add (Profile p);
	
	boolean add (HttpServletRequest request);
	boolean update (Profile profile);
	boolean delete (Profile profile);
	boolean search (HttpServletRequest request);

	
}
