package com.law.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.Case_HearingDAO;
import com.law.backend.dto.Case_Hearing;

@Repository("CaseHearingDA")
@Transactional
public class Case_HearingDAOimpl implements Case_HearingDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Case_Hearing> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Case_Hearing get(int id) {
		return sessionFactory.getCurrentSession().get(Case_Hearing.class, Integer.valueOf(id));
		
	}

	@Override
	public boolean add(Case_Hearing case_Hearing) {
		try {
			//Adding the profile shit
			sessionFactory.getCurrentSession().persist(case_Hearing);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Case_Hearing case_Hearing) {
		try {
			//Updating the profile shit
			sessionFactory.getCurrentSession().update(case_Hearing);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}  
	}

	@Override
	public boolean delete(Case_Hearing case_Hearing) {
		try {
			//Deleting the profile shit
			sessionFactory.getCurrentSession().delete(case_Hearing);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
