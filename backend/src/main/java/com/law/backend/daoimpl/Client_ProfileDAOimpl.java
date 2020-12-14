package com.law.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dto.Client_Profile;
import com.law.backend.dto.Profile;

@Repository("clientprofileDA")
@Transactional
public class Client_ProfileDAOimpl implements Client_ProfileDAO {
	Client_Profile p;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Client_Profile get(int id) {
		return sessionFactory.getCurrentSession().get(Client_Profile.class, Integer.valueOf(id));

	}
	
	
	@Override
	public boolean add(Client_Profile client_Profile) {
		try {
			// Adding the profile shit
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
			// Updating the profile shit
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
			// Deleting the profile shit
			sessionFactory.getCurrentSession().delete(client_Profile);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int getUid(String userEmail) {
		String getUserID = "From Profile where Uemail = :emailid";
		List<Profile> c = sessionFactory.getCurrentSession().createQuery(getUserID, Profile.class)
				.setParameter("emailid", userEmail).getResultList();
		Profile v = (Profile) c.get(0);
		return v.getUid();
	}

	// Method to get all the client name using id of the current user
	@Override
	public ArrayList<String> getclientnames(int Lid) {
		String getClientName = "From Client_Profile where Lid= :lid and status=true";
		ArrayList<String> clientname = new ArrayList<String>();

		List<Client_Profile> c = sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class).setParameter("lid", Lid).getResultList();

		int sizeoflist = c.size();
		for (int i = 0; i < sizeoflist; i++) {
			Client_Profile v = (Client_Profile) c.get(i);
			clientname.add(v.getCname());
		}
		return clientname;
	}

	@Override
	public List<Client_Profile> getAllClientName(int lid) {
		String getClientName = "From Client_Profile where Lid= :lid and status=TRUE";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
				.setParameter("lid", lid).getResultList();
	}


	@Override
	public ArrayList<String> getclientnames() {
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
	public List<Client_Profile> getAllClientNames() {
		String getClientName = "From Client_Profile where status=TRUE";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
				.getResultList();
	}

	
	@Override
	public List<Client_Profile> getAllClientDetails(int id) {
		String getClientName = "From Client_Profile where Lid= :lid and status=TRUE";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
				.setParameter("lid", id).getResultList();
		}

	
//	  @Override public boolean add(HttpServletRequest request) { if
//	  (request.getParameter("name")!=null) {
//	  System.out.println("I have reached add"); p=new Client_Profile();
//	  p.setCname(request.getParameter("name"));
//	  p.setCEmail(request.getParameter("email"));
//	  p.setCMoblie(request.getParameter("mobile"));
//	  p.setCaddress(request.getParameter("addr")); p.setLid(1);
//	  System.out.println(request.getParameter("name")); p.display();
//	  
//	  
//	  return add(p); } else return false; // TODO Auo-generated method stub //done
//	  
//	  // TODO Auto-generated method stub }
//	  }
//	  
	 /* @Override public List<Client_Profile> SearchRecord(String Name) { String
	 * getClientName = "From Client_Profile where C_Name= :name"; Client_Profile
	 * customer = null; ArrayList l=new ArrayList();
	 * 
	 * ResultSet rs= (ResultSet)
	 * sessionFactory.getCurrentSession().createQuery(getClientName,
	 * Client_Profile.class).setParameter("name", Name).getResultList(); return l; }
	 * 
	 * 
	 * @Override public Object[] SearchRecords() { // TODO Auto-generated method
	 * stub return null; }
	 */


	/*
	 * public List<Client_Profile> SearchRecords() {
	
		String getClientName = "From Client_Profile";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class).getResultList();
	} */
}
