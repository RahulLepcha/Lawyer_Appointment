package com.law.backend.daoimpl;

import java.util.ArrayList;
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
	

	// Method to get all the client name using id of the current user
	@Override
	public List<Client_Profile> getAllCourtcase(int lid) {
		String getClientName = "From Client_Profile where Lid= :lid and status=TRUE";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
				.setParameter("lid", lid).getResultList();
	}


	@Override
	public ArrayList<String> getAllCourtcase() {
		String getClientName = "From Client_Profile where status=TRUE";
		ArrayList<String> clientname = new ArrayList<String>();

		List<Client_Profile> c = sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
			.getResultList();

		int sizeoflist = c.size();
		for (int i = 0; i < sizeoflist; i++) {
			Client_Profile v = (Client_Profile) c.get(i);
			clientname.add(v.getCname());
		}
		return clientname;

	}


	@Override
	public List<Crt_Case> getAllCourtCases() {
		String getClientName = "From Crt_Case";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Crt_Case.class).getResultList();
		
	}

	
	@Override
	public List getAllCourtDetails(int id) {
		String getClientName = "FROM CRT_CASE ,CLIENT_PROFILE  where CLIENT_PROFILE.C_id=CRT_CASE.c_id and Cid=:id";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Crt_Case.class)
				.setParameter("id", id).getResultList();
		}




}
