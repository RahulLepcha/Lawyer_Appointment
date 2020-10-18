package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Case_Hearing {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="H_id")
	private int HId;
	@Column(name="Case_id")
	private int CaseId;
	@Column(name="C_id")
	private int Cid;
	@Column(name="Crt_id")
	private int CrtId;
	@Column(name="Stage")
	private String Stage;
	@Column(name="Brief")
	private String Brief;
	@Column(name="Previous_Date")
	private String PreviousDate;
	@Column(name="Next_Date")
	private String NextDate;
	@Column(name="L_id")
	private int Lid;
	public int getHId() {
		return HId;
	}
	public void setHId(int hId) {
		HId = hId;
	}
	public int getCaseId() {
		return CaseId;
	}
	public void setCaseId(int caseId) {
		CaseId = caseId;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public int getCrtId() {
		return CrtId;
	}
	public void setCrtId(int crtId) {
		CrtId = crtId;
	}
	public String getStage() {
		return Stage;
	}
	public void setStage(String stage) {
		Stage = stage;
	}
	public String getBrief() {
		return Brief;
	}
	public void setBrief(String brief) {
		Brief = brief;
	}
	public String getPreviousDate() {
		return PreviousDate;
	}
	public void setPreviousDate(String previousDate) {
		PreviousDate = previousDate;
	}
	public String getNextDate() {
		return NextDate;
	}
	public void setNextDate(String nextDate) {
		NextDate = nextDate;
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	@Override
	public String toString() {
		return "Case_Hearing [HId=" + HId + ", CaseId=" + CaseId + ", Cid=" + Cid + ", CrtId=" + CrtId + ", Stage="
				+ Stage + ", Brief=" + Brief + ", PreviousDate=" + PreviousDate + ", NextDate=" + NextDate + ", Lid="
				+ Lid + "]";
	}
	

}
