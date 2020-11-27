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
		int lid=clientprofileDA.getUid("chhugain@gmail.com");
		// Add Opreation to table
		cp = new Client_Profile();
		System.out.println("value of rema :"+lid);
		cp.setLid(lid);
		cp.setCname("Priya");
		cp.setCMoblie("9732055446");
		cp.setCEmail("piryakhawas@gmail.com");
		cp.setCaddress("Darjeeling");
		
		assertEquals("Succesfully added new Client Profile", true, clientprofileDA.add(cp));

		
	}
}
