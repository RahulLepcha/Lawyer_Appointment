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
	@Column(name = "case_Uid")
	private String caseuID;
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
	@Column(name = "Case_P_date")
	private String CasePdate;
	@Column(name = "Case_N_date")
	private String CaseNdate;
	@Column(name = "Appointment_Time")
	private String AppointmentTime;
	@Column(name = "Case_Priority")
	private String CasePriority;
	@Column(name = "status")
	private String status;
	@Column(name="L_id")
	private int Lid;
	@Column(name="stage")
	private String Stage;

	
	


	
	@Override
	public String toString() {
		return "Case_Hearing [HId=" + HId + ", caseuID=" + caseuID + ", Cid=" + Cid + ", Crtid=" + Crtid
				+ ", OppositionPartyName=" + OppositionPartyName + ", CaseBrief=" + CaseBrief + ", CaseIdate="
				+ CaseIdate + ", CasePdate=" + CasePdate + ", CaseNdate=" + CaseNdate + ", AppointmentTime="
				+ AppointmentTime + ", CasePriority=" + CasePriority + ", status=" + status + ", Lid=" + Lid
				+ ", Stage=" + Stage + "]";
	}
	public String getCaseuID() {
		return caseuID;
	}
	public void setCaseuID(String caseuID) {
		this.caseuID = caseuID;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public int getCrtid() {
		return Crtid;
	}
	public void setCrtid(int crtid) {
		Crtid = crtid;
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
	public String getCasePdate() {
		return CasePdate;
	}
	public void setCasePdate(String casePdate) {
		CasePdate = casePdate;
	}
	public String getCaseNdate() {
		return CaseNdate;
	}
	public void setCaseNdate(String caseNdate) {
		CaseNdate = caseNdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStage() {
		return Stage;
	}
	public void setStage(String stage) {
		Stage = stage;
	}
	public String getCasePriority() {
		return CasePriority;
	}
	public void setCasePriority(String casePriority) {
		if (casePriority.equalsIgnoreCase("on"))
			CasePriority = "on";
		else
			CasePriority = "off";
	}
	public String getAppointmentTime() {
		return AppointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		AppointmentTime = appointmentTime;
	}

	public int getHId() {
		return HId;
	}
	public void setHId(int hId) {
		HId = hId;
	}
	public String getCaseId() {
		return caseuID;
	}
	public void setCaseId(String caseId) {
		caseuID = caseId;
	}
	public String getBrief() {
		return CaseBrief;
	}
	public void setBrief(String brief) {
		CaseBrief = brief;
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	

	

}
