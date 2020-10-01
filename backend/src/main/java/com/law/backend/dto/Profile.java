package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
	//Auto generating getter and Setter
	
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
	
	
	@Override
	public String toString() {
		return "Profile [Uid=" + Uid + ", Uname=" + Uname + ", Uemail=" + Uemail + ", Upassword=" + Upassword
				+ ", Umobile=" + Umobile + "]";
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

}
