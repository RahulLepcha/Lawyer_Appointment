package com.law.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dto.Client_Profile;

@Repository("clientprofileDA*")
@Transactional
public class Client_ProfileDAOimpl implements Client_ProfileDAO {

	
	@Autowired
	private SessionFactory sessionFactory; 
	
	
	@Override
	public List<Client_Profile> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client_Profile get(int id) {
		return sessionFactory.getCurrentSession().get(Client_Profile.class, Integer.valueOf(id));
		
	}

	@Override
	public boolean add(Client_Profile client_Profile) {
		try {
			//Adding the profile shit
			sessionFactory.getCurrentSession().persist(client_Profile);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	

	@Override
	public boolean update(Client_Profile client_Profile) {
		try {
			//Updating the profile shit
			sessionFactory.getCurrentSession().update(client_Profile);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

	@Override
	public boolean delete(Client_Profile client_Profile) {
		try {
			//Deleting the profile shit
			sessionFactory.getCurrentSession().delete(client_Profile);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

	

}
