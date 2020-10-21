package com.law.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.Case_HearingDAO;
import com.law.backend.dto.Case_Hearing;
import com.law.backend.dto.Client_Profile;
import com.law.backend.dto.Crt_Case;

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

	@Override
	public Crt_Case getCaseIDs(String clientname, String opponentname) {
		int getClientId=getcid(clientname);
		String getCaseDetails="From Crt_Case where OppositionPartyName= :oppname and Cid= :cid";
		List<Crt_Case> c = sessionFactory.getCurrentSession().createQuery(getCaseDetails, Crt_Case.class)
				.setParameter("oppname", opponentname)
				.setParameter("cid", getClientId).getResultList();
		Crt_Case v=(Crt_Case)c.get(0);
		return v;
	}
	
	private int getcid(String ClientName)
	{
		String getClientID="From Client_Profile where Cname = :cname";
		List<Client_Profile> c = sessionFactory.getCurrentSession().createQuery(getClientID, Client_Profile.class)
				.setParameter("cname", ClientName).getResultList();
		Client_Profile v=(Client_Profile)c.get(0);
		return v.getCid();
	}

}
