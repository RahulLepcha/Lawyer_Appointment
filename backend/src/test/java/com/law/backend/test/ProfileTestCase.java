package com.law.backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.law.backend.dao.ProfileDAO;
import com.law.backend.dto.Profile;

public class ProfileTestCase {

	private static AnnotationConfigApplicationContext context;
	private static ProfileDAO profileDA;

	private Profile p;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.law.backend");
		context.refresh();

		profileDA = (ProfileDAO) context.getBean("profileDA");
	}

	/*
	 * @Test public void testAddProfile() { p =new Profile(); p.setUname("Rahul");
	 * p.setUmobile("8624971999"); p.setUemail("chhugain@gmail.com");
	 * p.setUpassword("chugain123");
	 * 
	 * assertEquals("Succesfully added new Profile",true,profileDA.add(p));
	 * 
	 * }
	 */

	@Test
	public void testProfileCurd() {

		// Add Opreation to table
		p = new Profile();
		p.setUname("Rahul");
		p.setUmobile("8624971999");
		p.setUemail("chhugain@gmail.com");
		p.setUpassword("chugain123");

		assertEquals("Succesfully added new Profile", true, profileDA.add(p));

		p = new Profile();
		p.setUname("Rema");
		p.setUmobile("8624971999");
		p.setUemail("rema@gmail.com");
		p.setUpassword("arem123");

		assertEquals("Succesfully added new Profile", true, profileDA.add(p));

		// Updating the vlue and upadting the value of mobile number

		p = profileDA.get(3);
		p.setUmobile("8413896733");
		assertEquals("Succesfully updated the Mobile number", true, profileDA.update(p));

		// deleteing the value from the database
		p = profileDA.get(4);
		assertEquals("Succesfully updated the Mobile number", true, profileDA.delete(p));

	}

}
