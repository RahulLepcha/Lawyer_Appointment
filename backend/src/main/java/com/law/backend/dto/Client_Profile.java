package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Client_Profile {
	
	//declaring the attribute
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="C_id")
		private int Cid;
		@Column(name="C_name")
		private String Cname;
		@Column(name="C_Moblie")
		private String CMoblie;
		@Column(name="C_Email")
		private String CEmail;
		@Column(name="C_address")
		private String Caddress;
		@Column(name="L_id")
		private int Lid;
		
		//generating getter and setter
		
		public int getCid() {
			return Cid;
		}
		public void setCid(int cid) {
			Cid = cid;
		}
		public String getCname() {
			return Cname;
		}
		public void setCname(String cname) {
			Cname = cname;
		}
		public String getCMoblie() {
			return CMoblie;
		}
		public void setCMoblie(String cMoblie) {
			CMoblie = cMoblie;
		}
		public String getCEmail() {
			return CEmail;
		}
		public void setCEmail(String cEmail) {
			CEmail = cEmail;
		}
		public String getCaddress() {
			return Caddress;
		}
		public void setCaddress(String caddress) {
			Caddress = caddress;
		}
		public int getLid() {
			return Lid;
		}
		public void setLid(int lid) {
			Lid = lid;
		}
		
		
		@Override
		public String toString() {
			return "Client_Profile [Cid=" + Cid + ", Cname=" + Cname + ", CMoblie=" + CMoblie + ", CEmail=" + CEmail
					+ ", Caddress=" + Caddress + ", Lid=" + Lid + "]";
		}
		
		
		


}
