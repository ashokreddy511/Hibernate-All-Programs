package com.jig.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="APPAINTMENT")
public class Appaintment {
	@Id
	@Column(name="appointmrentNo")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String appointmrentNo;
	@Column(name="appointmentDate")
	private Date appointmentDate;
	@Column(name="doctor")
	private String doctor;
	@Column(name="pacentName")
	private String pacentName;
	@Column(name="mpbile")
	private String mpbile;
	@Column(name="mail")
	private String mail;
	public String getAppointmrentNo() {
		return appointmrentNo;
	}
	public void setAppointmrentNo(String appointmrentNo) {
		this.appointmrentNo = appointmrentNo;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getPacentName() {
		return pacentName;
	}
	public void setPacentName(String pacentName) {
		this.pacentName = pacentName;
	}
	public String getMpbile() {
		return mpbile;
	}
	public void setMpbile(String mpbile) {
		this.mpbile = mpbile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Appaintment [appointmrentNo=" + appointmrentNo
				+ ", appointmentDate=" + appointmentDate + ", doctor=" + doctor
				+ ", pacentName=" + pacentName + ", mpbile=" + mpbile
				+ ", mail=" + mail + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
		result = prime * result
				+ ((appointmrentNo == null) ? 0 : appointmrentNo.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((mpbile == null) ? 0 : mpbile.hashCode());
		result = prime * result
				+ ((pacentName == null) ? 0 : pacentName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appaintment other = (Appaintment) obj;
		if (appointmentDate == null) {
			if (other.appointmentDate != null)
				return false;
		} else if (!appointmentDate.equals(other.appointmentDate))
			return false;
		if (appointmrentNo == null) {
			if (other.appointmrentNo != null)
				return false;
		} else if (!appointmrentNo.equals(other.appointmrentNo))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (mpbile == null) {
			if (other.mpbile != null)
				return false;
		} else if (!mpbile.equals(other.mpbile))
			return false;
		if (pacentName == null) {
			if (other.pacentName != null)
				return false;
		} else if (!pacentName.equals(other.pacentName))
			return false;
		return true;
	}
		
	
}
