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
String a ,b,c,d;
	@Test
//	public void testProfileCurd() {
//
//		// Add Opreation to table
//	 Profile p2 = new Profile();
//		a= p2.getUname();
//		b= p2.getUmobile();
//		c = p2.getUemail();
//		d = p2.getUpassword();
////		d = p2.getErem();
////		d = p2.getSrem();
////		d = p2.getRrem();
////		d = p2.getPrem();
//
//		
//		System.out.println(a+b+c+d);
//		    
//		assertEquals("Succesfully added new Profile", true, profileDA.add(p));
//		// Updating the vlue and upadting the value of mobile number
//	}
   public void testProfileCurd1() {

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

//		p = profileDA.get(33);
//		p.setUmobile("8413896733");
//		assertEquals("Succesfully updated the Mobile number", true, profileDA.update(p));
//
//		// deleteing the value from the database
//		p = profileDA.get(34);
//		assertEquals("Succesfully updated the Mobile number", true, profileDA.delete(p));

	}

}
