package com.law.backend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.law.backend.dao.CourtDAO;
import com.law.backend.dto.Court;

public class CourtTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CourtDAO courtDA;
	
	private Court c;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.law.backend");
		context.refresh();

		courtDA = (CourtDAO) context.getBean("courtDA");
	}
	
	@Test
	public void testCourtCurd() {

		// Add Opreation to table
		c = new Court();
		c.setCrtName("Local_Court_Pune");
		assertEquals("Succesfully added new Court Profile", true, courtDA.add(c));

		//tes
		String s="Local_Court_Pune";
		assertEquals("to get the value", 36, courtDA.getCrtId(s));
	}

}
