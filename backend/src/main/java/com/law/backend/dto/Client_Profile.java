package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Client_Profile {
	
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
		@JsonIgnore
		private int Lid;
		@Column(name="STATUS")
		private boolean status;
		
		//generating getter and setter
		
	public Client_Profile()
	{
		
	}
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
		public void setCMoblie(String cMoblie2) {
			CMoblie = cMoblie2;
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
			System.out.println(lid);
           Lid=lid;
		}
		public void setStatus(boolean i) {
			// TODO Auto-generated method stub
			status=i;
		}
		public boolean getStatus() {
			// TODO Auto-generated method stub
			return status;
		}
		
		
		@Override
		public String toString() {
			return "Client_Profile [Cid=" + Cid + ", Cname=" + Cname + ", CMoblie=" + CMoblie + ", CEmail=" + CEmail
					+ ", Caddress=" + Caddress + ", Lid=" + Lid + ", status=" + status + "]";
		}
		
		
		
		


}
