package com.law.backend.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.SessionFactory;

@Entity
public class Profile<HttpServletRequest> {
	// Auto generating getter and Setter
	public Profile() {
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

	public void isStatus(boolean b) {
		// TODO Auto-generated method stub
		status = b;

	}

	public boolean getStatus() {
		// TODO Auto-generated method stub
		return status;

	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getErem() {
		return Erem;
	}

	/**
	 * @param erem the erem to set
	 */
	public void setErem(String erem) {
		if (erem != null)
			Erem = "on";
		else
			Erem = "off";
	}

	/**
	 * @return the srem
	 */
	public String getSrem() {
		return Srem;
	}

	/**
	 * @param srem the srem to set
	 */
	public void setSrem(String srem) {
		if (srem != null)
			Srem = "on";
		else
			Srem = "off";
	}

	/**
	 * @return the prem
	 */
	public String getPrem() {
		return Prem;
	}

	/**
	 * @param prem the prem to set
	 */
	public void setPrem(String prem) {
		if (prem != null)
			Prem = "on";
		else
			Prem = "off";

	}

	/**
	 * @return the rrem
	 */
	public String getRrem() {
		return Rrem;
	}

	/**
	 * @param rrem2 the rrem to set
	 */
	public void setRrem(String rrem) {
		if (rrem != null)
			Rrem = "on";
		else
			Rrem = "off";
	}

	// declaring the attribute
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "L_id")
	private int Uid;
	@Column(name = "L_name")
	private String Uname;
	@Column(name = "L_Email")
	private String Uemail;
	@Column(name = "L_password")
	private String Upassword;
	@Column(name = "RREM")
	private String Rrem = "on";
	@Column(name = "EREM")
	private String Erem = "on";
	@Column(name = "SREM")
	private String Srem = "on";
	@Column(name = "PREM")
	private String Prem = "on";
	@Column(name = "STATUS")
	private boolean status;
	@Column(name = "ROLE")
	private String role = "lawyer";
	@Column(name = "L_Moblie")
	private String Umobile;

	@Override
	public String toString() {
		return "Profile [Uid=" + Uid + ", Uname=" + Uname + ", Uemail=" + Uemail + ", Upassword=" + Upassword
				+ ", Rrem=" + Rrem + ", Erem=" + Erem + ", Srem=" + Srem + ", Prem=" + Prem + ", status=" + status
				+ ", role=" + role + ", Umobile=" + Umobile + "]";
	}

	public int search(String email) {
		SessionFactory sessionFactory = null;

		String getUserID = "From Profile where Uemail = :emailid";
		List<Profile> c = sessionFactory.getCurrentSession().createQuery(getUserID, Profile.class)
				.setParameter("emailid", email).getResultList();
		if (c.isEmpty()) {
			System.out.println("I am sending true");
			return 1;
		} else
			System.out.println("I am sending False");

		return c.get(0).Uid;

	}

}