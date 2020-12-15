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
	private String caseuID;
	@Column(name="Stage")
	private String Stage;
	@Column(name="Brief")
	private String CaseBrief;
	@Column(name="Previous_Date")
	private String PreviousDate;
	@Column(name="Next_Date")
	private String NextDate;
	@Column(name="Appointment_time")
	private String AppointmentTime;
	public String getAppointmentTime() {
		return AppointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		AppointmentTime = appointmentTime;
	}
	@Column(name="L_id")
	private int Lid;
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
	public String getStage() {
		return Stage;
	}
	public void setStage(String stage) {
		Stage = stage;
	}
	public String getBrief() {
		return CaseBrief;
	}
	public void setBrief(String brief) {
		CaseBrief = brief;
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
		return "Case_Hearing [HId=" + HId + ", caseuID=" + caseuID + ", Stage=" + Stage + ", CaseBrief=" + CaseBrief
				+ ", PreviousDate=" + PreviousDate + ", NextDate=" + NextDate + ", AppointmentTime=" + AppointmentTime
				+ ", Lid=" + Lid + "]";
	}
	

	

}
