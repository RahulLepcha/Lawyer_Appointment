package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client_Profile<HttpServletRequest> {
	
	//declaring the attribute
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="C_ID")
		private int Cid;
		@Column(name="C_NAME")
		private String Cname;
		@Column(name="C_MOBLIE")
		private String CMoblie;
		@Column(name="C_EMAIL")
		private String CEmail;
		@Column(name="C_ADDRESS")
		private String Caddress;
		@Column(name="L_ID")
		private int Lid=100;
		
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
			//Profile p=new Profile();
			int Lid=100;
			//=p.search("michellesolomon111@gmail.com");
			//System.out.println(Lid);

		}
		
		@Override
		public String toString() {
			return "Client_Profile [Cid=" + Cid + ", Cname=" + Cname + ", CMoblie=" + CMoblie + ", CEmail=" + CEmail
					+ ", Caddress=" + Caddress + ", Lid=" + Lid + "]";
		}
		
		public void display() {
			System.out.println("Client_Profile [Cid=" + Cid + ", Cname=" + Cname + ", CMoblie=" + CMoblie + ", CEmail=" + CEmail
					+ ", Caddress=" + Caddress + ", Lid=" + Lid + "]");
		}
		
		
		
		


}
