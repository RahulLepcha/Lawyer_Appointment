package com.law.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.Crt_CaseDAO;
import com.law.backend.dto.Client_Profile;
import com.law.backend.dto.Court;
import com.law.backend.dto.Crt_Case;
import com.law.backend.dto.Profile;


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

	@Override
	public int getUid(String UserEmail) {
		String getUserID="From Profile where Uemail = :emailid";
		List<Profile> c = sessionFactory.getCurrentSession().createQuery(getUserID, Profile.class)
				.setParameter("emailid", UserEmail).getResultList();
		Profile v=(Profile)c.get(0);
		return v.getUid();
	}

	@Override
	public int getCid(String ClientName) {
		String getClientID="From Client_Profile where Cname = :cname";
		List<Client_Profile> c = sessionFactory.getCurrentSession().createQuery(getClientID, Client_Profile.class)
				.setParameter("cname", ClientName).getResultList();
		Client_Profile v=(Client_Profile)c.get(0);
		return v.getCid();
	}

	@Override
	public int getCrtid(String CourtName) {
		String getCourtID="From Court where Crtname = :crtname";
		List<Court> c = sessionFactory.getCurrentSession().createQuery(getCourtID, Court.class)
				.setParameter("crtname", CourtName).getResultList();
		Court v=(Court)c.get(0);
		return v.getCrtid();
	}

}
