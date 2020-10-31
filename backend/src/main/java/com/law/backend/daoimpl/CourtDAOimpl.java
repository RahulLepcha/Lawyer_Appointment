package com.law.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.CourtDAO;
import com.law.backend.dto.Court;

@Repository("courtDA")
@Transactional
public class CourtDAOimpl implements CourtDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Court> courtNames=new ArrayList<Court>();
	
	@Override
	public List<Court> list() {
		// TODO Auto-generated method stub
		return courtNames;
	}

	@Override
	public Court get(int id) {
		return sessionFactory.getCurrentSession().get(Court.class, Integer.valueOf(id));

	}

	@Override
	public boolean add(Court court) {
		try {
			// Adding the profile shit
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
			// Updating the profile shit
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
			// Deleting the profile shit
			sessionFactory.getCurrentSession().delete(court);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int getCrtId(String crtName) {
		// TODO Auto-generated method stub
		String crtId = "From Court where CrtName = :crtName";
		List<Court> c = sessionFactory.getCurrentSession().createQuery(crtId, Court.class)
				.setParameter("crtName", crtName).getResultList();
		Court v=(Court)c.get(0);
		return v.getCrtid();
	}

	@Override
	public ArrayList<String> getCrtNames() {
		String CrtName ="From Court";
		ArrayList<String> crtname=new ArrayList<String>();
		List<Court> c =sessionFactory.getCurrentSession().createQuery(CrtName,Court.class).getResultList();
		int sizeoflist=c.size();
		System.out.println("size of the list"+sizeoflist);
		for(int i =0;i<sizeoflist;i++)
		{
			Court v=(Court)c.get(i);
			crtname.add(v.getCrtName());
		}
		//needs work
		System.out.println(crtname);
		return crtname;
	}

}
