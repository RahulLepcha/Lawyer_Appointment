package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Court {

	//declaring the attribute
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="Crt_id")
		private int Crtid;
		@Column(name="Crt_Name")
		private String CrtName;
		
		//declaring setter and getter
		
		public int getCrtid() {
			return Crtid;
		}
		public void setCrtid(int crtid) {
			Crtid = crtid;
		}
		public String getCrtName() {
			return CrtName;
		}
		public void setCrtName(String crtName) {
			CrtName = crtName;
		}
		
		
		@Override
		public String toString() {
			return "Court [Crtid=" + Crtid + ", CrtName=" + CrtName + "]";
		}
		
		

}
