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

	
}
