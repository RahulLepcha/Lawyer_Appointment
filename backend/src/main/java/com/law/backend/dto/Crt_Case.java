package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crt_Case {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Case_id")
	private int CaseId;
	@Column(name="case_Uid")
	private String caseuID;
	public String getCaseuID() {
		return caseuID;
	}
	public void setCaseuID(String caseuID) {
		this.caseuID = caseuID;
	}
	public void setCasePriority(String casePriority) {
		if(casePriority.equalsIgnoreCase("on"))
		CasePriority ="on" ;
		else
			CasePriority="off";
	}
	
	@Column(name = "C_id")
	private int Cid;
	@Column(name = "Crt_id")
	private int Crtid;
	@Column(name = "Opposition_Party_Name")
	private String OppositionPartyName;
	@Column(name = "Case_Brief")
	private String CaseBrief;
	@Column(name = "Case_I_date")
	private String CaseIdate;
	@Column(name = "Case_Priority")
	private String CasePriority;
	@Column(name = "L_id")
	private int Lid;
	@Column(name = "status")
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCasePriority() {
		return CasePriority;
	}
	public int getCrtid() {
		return Crtid;
	}

	public void setCrtid(int crtid) {
		Crtid = crtid;
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

	public String getOppositionPartyName() {
		return OppositionPartyName;
	}

	public void setOppositionPartyName(String oppositionPartyName) {
		OppositionPartyName = oppositionPartyName;
	}

	public String getCaseBrief() {
		return CaseBrief;
	}

	public void setCaseBrief(String caseBrief) {
		CaseBrief = caseBrief;
	}

	public String getCaseIdate() {
		return CaseIdate;
	}

	public void setCaseIdate(String caseIdate) {
		CaseIdate = caseIdate;
	}

	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	@Override
	public String toString() {
		return "Crt_Case [CaseId=" + CaseId + ", caseuID=" + caseuID + ", Cid=" + Cid + ", Crtid=" + Crtid
				+ ", OppositionPartyName=" + OppositionPartyName + ", CaseBrief=" + CaseBrief + ", CaseIdate="
				+ CaseIdate + ", CasePriority=" + CasePriority + ", Lid=" + Lid + ", status=" + status + "]";
	}

}
