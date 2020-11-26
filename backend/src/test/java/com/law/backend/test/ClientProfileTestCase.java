package com.law.backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.law.backend.dao.Client_ProfileDAO;
import com.law.backend.dto.Client_Profile;

public class ClientProfileTestCase {

	private static AnnotationConfigApplicationContext context;
	public static Client_ProfileDAO clientprofileDA;
	
	private Client_Profile cp;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.law.backend");
		context.refresh();

		clientprofileDA = (Client_ProfileDAO) context.getBean("clientprofileDA");
	}
	
	@Test
	public void testCourtCurd() {
		int lid=clientprofileDA.getUid("rema@gmail.com");
		// Add Opreation to table
		cp = new Client_Profile();
		cp.setLid(lid);
		cp.setCname("xyz");
		cp.setCMoblie("8624971999");
		cp.setCEmail("chhugain@gmail.com");
		cp.setCaddress("baba black sheep");
		
		assertEquals("Succesfully added new Client Profile", true, clientprofileDA.add(cp));

		
	}
}
