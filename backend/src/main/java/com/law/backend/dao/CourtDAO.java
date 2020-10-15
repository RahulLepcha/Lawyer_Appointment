package com.law.backend.dao;

import java.util.List;

import com.law.backend.dto.Court;
import com.law.backend.dto.Profile;

public interface CourtDAO {
	List<Court> list();

	Court get(int id);

	boolean add(Court court);

	boolean update(Court court);

	boolean delete(Court court);

}