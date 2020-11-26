package com.law.backend.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Profile<HttpServletRequest> {
	//Auto generating getter and Setter
	public Profile()
	{
    System.out.println("I am in profile");
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUemail() {
		return Uemail;
	}
	public void setUemail(String uemail) {
		Uemail = uemail;
	}
	public String getUpassword() {
		return Upassword;
	}
	public void setUpassword(String upassword) {
		Upassword = upassword;
	}
	public String getUmobile() {
		return Umobile;
	}
	public void setUmobile(String umobile) {
		Umobile = umobile;
	}
	

	public int getErem() {
		return Erem;
	}
	/**
	 * @param erem the erem to set
	 */
	public void setErem(int erem) {
		Erem = erem;
	}
	/**
	 * @return the srem
	 */
	public int getSrem() {
		return Srem;
	}
	/**
	 * @param srem the srem to set
	 */
	public void setSrem(int srem) {
		Srem = srem;
	}
	/**
	 * @return the prem
	 */
	public int getPrem() {
		return Prem;
	}
	/**
	 * @param prem the prem to set
	 */
	public void setPrem(int prem) {
		Prem = prem;
	}
	/**
	 * @return the rrem
	 */
	public int getRrem() {
		return Rrem;
	}
	/**
	 * @param rrem2 the rrem to set
	 */
	public void setRrem(int rrem) {
		Rrem = rrem;
	}
	


	//declaring the attribute
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="L_id")
	private int Uid;
	@Column(name="L_name")
	private String Uname;
	@Column(name="L_Email")
	private String Uemail;
	@Column(name="L_password")
	private String Upassword;
	@Column(name="L_Moblie")
	private String Umobile;
	@Column(name="Erem")
	private int Erem;
	@Column(name="Srem")
	private int Srem;
	@Column(name="Prem")
	private int Prem;
	@Column(name="Rrem")
	private int Rrem;
	/**
	 * @return the erem
	 */
	@Override
	public String toString() {
		return "Profile [Uid=" + Uid + ", Uname=" + Uname + ", Uemail=" + Uemail + ", Upassword=" + Upassword
				+ ", Umobile=" + Umobile + "]";
	}
	public int search(String email) {
		SessionFactory sessionFactory = null; 
		
			String getUserID = "From Profile where Uemail = :emailid";
			List<Profile> c = sessionFactory.getCurrentSession().createQuery(getUserID, Profile.class)
					.setParameter("emailid", email).getResultList();
			if (c.isEmpty())
			{
				System.out.println("I am sending true");
						return 100;
			}
			else
				System.out.println("I am sending False");
			
			return c.get(0).Uid;
			
		
		
	}
	
}