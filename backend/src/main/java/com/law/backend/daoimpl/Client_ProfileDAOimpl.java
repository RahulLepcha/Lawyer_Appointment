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
		String getClientName = "From Client_Profile where Lid= :lid";
		ArrayList<String> clientname = new ArrayList<String>();

		List<Client_Profile> c = sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
				.setParameter("lid", Lid).getResultList();

		int sizeoflist = c.size();
		for (int i = 0; i < sizeoflist; i++) {
			Client_Profile v = (Client_Profile) c.get(i);
			clientname.add(v.getCname());
		}
		return clientname;
	}

	@Override
	public List<Client_Profile> getAllClientName(int lid) {
		String getClientName = "From Client_Profile where Lid= :lid";
		return sessionFactory.getCurrentSession().createQuery(getClientName, Client_Profile.class)
				.setParameter("lid", lid).getResultList();
	}

}
