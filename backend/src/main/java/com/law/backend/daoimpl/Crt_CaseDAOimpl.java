package com.law.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.Crt_CaseDAO;
import com.law.backend.dto.Crt_Case;


@Repository("CrtCaseDA")
@Transactional
public class Crt_CaseDAOimpl implements Crt_CaseDAO {

	@Autowired
	private SessionFactory sessionFactory; 
	
	
	@Override
	public List<Crt_Case> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Crt_Case get(int id) {
		return sessionFactory.getCurrentSession().get(Crt_Case.class, Integer.valueOf(id));
		
	}

	@Override
	public boolean add(Crt_Case crt_Case) {
		try {
			//Adding the profile shit
			sessionFactory.getCurrentSession().persist(crt_Case);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Crt_Case crt_Case) {
		try {
			//Updating the profile shit
			sessionFactory.getCurrentSession().update(crt_Case);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

	@Override
	public boolean delete(Crt_Case crt_Case) {
		try {
			//Deleting the profile shit
			sessionFactory.getCurrentSession().delete(crt_Case);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

}
