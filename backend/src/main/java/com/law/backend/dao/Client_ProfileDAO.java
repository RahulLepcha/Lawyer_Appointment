package com.law.backend.dao;

import java.util.ArrayList;
import java.util.List;

import com.law.backend.dto.Client_Profile;

public interface Client_ProfileDAO {
	
	
	Client_Profile get(int id);
	int getUid(String userEmail);
	boolean add (Client_Profile client_Profile);
	boolean update (Client_Profile client_Profile);
	boolean delete (Client_Profile client_Profile);
	
	

	//Geting all the ClientName by lawyers id
		 ArrayList<String> getclientnames(int Lid);
		 ArrayList<String> getclientnames();
		 
		 //this is for json  data pull to get all the client details using id of the lawyer
		 List<Client_Profile> getAllClientName(int lid);
		 List<Client_Profile> getAllClientNames();
		List<Client_Profile> getAllClientDetails(int data);
		//ArrayList getAllClients();
			
	//	boolean add(HttpServletRequest request);
//		boolean add(HttpServletRequest request);
//		Object[] SearchRecords();
//		List<Client_Profile> SearchRecord(String Name) throws SQLException ;

	
}
