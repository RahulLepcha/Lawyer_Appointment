package com.law.backend.daoimpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.law.backend.dao.ProfileDAO;
import com.law.backend.dto.Profile;

@Repository("profileDA")
@Transactional
public class ProfileDAOimpl implements ProfileDAO {
	Profile p;
	@Autowired
	private SessionFactory sessionFactory; 
	
	/*private static List<Profile> pro = new ArrayList<>();
	 
	 * static { Profile p = new Profile(); p.setUid(1); p.setUname("Rahul");
	 * p.setUmobile("8624971999"); p.setUemail("chhugain@gmail.com");
	 * p.setUpassword("chugain123");
	 * 
	 * pro.add(p);
	 * 
	 * p.setUid(2); p.setUname("Rahul"); p.setUmobile("8624971999");
	 * p.setUemail("chhugain@gmail.com"); p.setUpassword("chugain123");
	 * 
	 * pro.add(p); }
	 */
	@Override
	public List<Profile> list() {
		// TODO Auto-generated method stub
		return null;
	}
////Mich
//	private JdbcTemplate jdbcTemplate;  
//	  final String INSERT_QUERY = "insert into  (name, age) values (?, ?)";
//	  final String UPDATE_QUERY = "update employee set age = ? where id = ?";
//	  final String DELETE_QUERY = "delete from employee where id = ?";
//	  
	@Override
	public boolean add(Profile profile) {
		try {
			//Adding the profile shit
			sessionFactory.getCurrentSession().persist(profile);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Profile profile) {
		try {
			//Updating the profile shit
			sessionFactory.getCurrentSession().update(profile);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

	@Override
	public boolean delete(Profile profile) {
		try {
			//Deleting the profile shit
			sessionFactory.getCurrentSession().delete(profile);
			return true;
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}    
	}

	@Override
	public Profile get(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Profile.class, Integer.valueOf(id));
		}

		/*
		 * @Override public boolean add(HttpServletRequest request) { // do the setter
		 * part overhere if (request.getParameter("Name")!=null) { if(search(request)) {
		 * p=new Profile();
		 * 
		 * p.setUname(request.getParameter("Name"));
		 * 
		 * p.setUemail(request.getParameter("email"));
		 * 
		 * p.setUmobile(request.getParameter("mobile"));
		 * p.setUpassword(request.getParameter("password")); int Rrem,Srem,Erem,Prem; if
		 * (request.getParameter("Rrem") != null) Rrem=1; else Rrem=0; if
		 * (request.getParameter("Erem") != null) Erem=1; else Erem=0; if
		 * (request.getParameter("Srem") != null) Srem=1; else Srem=0; if
		 * (request.getParameter("Prem") != null) Prem=1; else Prem=0; p.setRrem(Rrem);
		 * p.setSrem(Srem); p.setPrem(Prem); p.setErem(Erem);
		 * 
		 * p.toString();
		 * 
		 * return add(p); } else return false; } else return false; // TODO
		 * Auo-generated method stub //done
		 * 
		 * }
		 * 
		 * @Override public boolean search(HttpServletRequest request) { String
		 * userEmail=request.getParameter("email"); String getUserID =
		 * "From Profile where Uemail = :emailid"; List<Profile> c =
		 * sessionFactory.getCurrentSession().createQuery(getUserID, Profile.class)
		 * .setParameter("emailid", userEmail).getResultList(); if (c.isEmpty()) {
		 * System.out.println("I am sending true"); return true; } else
		 * System.out.println("I am sending False");
		 * 
		 * return false;
		 * 
		 * 
		 * 
		 * }
		 */
	

}
