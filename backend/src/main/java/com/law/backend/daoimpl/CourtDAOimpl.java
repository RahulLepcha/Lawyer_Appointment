package com.law.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.CourtDAO;
import com.law.backend.dto.Court;
import com.law.backend.dto.Profile;

@Repository("courtDA")
@Transactional
public class CourtDAOimpl implements CourtDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Court> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Court get(int id) {
		return sessionFactory.getCurrentSession().get(Court.class, Integer.valueOf(id));

	}

	@Override
	public boolean add(Court court) {
		try {
			//Adding the profile shit
			sessionFactory.getCurrentSession().persist(court);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Court court) {
		try {
			//Updating the profile shit
			sessionFactory.getCurrentSession().update(court);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

	@Override
	public boolean delete(Court court) {
		try {
			//Deleting the profile shit
			sessionFactory.getCurrentSession().delete(court);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

}
