package com.law.backend.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Crt_Case {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Case_id")
	private int CaseId;
	@Column(name="C_id")
	private int Cid;
	@Column(name="Opposition_Party_Name")
	private String OppositionPartyName;
	@Column(name="Case_Brief")
	private String CaseBrief;
	@Column(name="Case_I_date")
	private String CaseIdate;
	@Column(name="Case_Priority")
	private Boolean CasePriority;
	@Column(name="L_id")
	private int Lid;
	
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
	public Boolean getCasePriority() {
		return CasePriority;
	}
	public void setCasePriority(Boolean casePriority) {
		CasePriority = casePriority;
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	@Override
	public String toString() {
		return "Crt_Case [CaseId=" + CaseId + ", Cid=" + Cid + ", OppositionPartyName=" + OppositionPartyName
				+ ", CaseBrief=" + CaseBrief + ", CaseIdate=" + CaseIdate + ", CasePriority=" + CasePriority + ", Lid="
				+ Lid + "]";
	}
	
}
