package com.idg.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Appaintment {
protected int appointmentNo;
protected Date appointmentDate;
protected String doctor;
protected String pacentName;
protected String mobileNo;
protected String mail;
public int getAppointmentNo() {
	return appointmentNo;
}
public void setAppointmentNo(int appointmentNo) {
	this.appointmentNo = appointmentNo;
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
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((appointmentDate == null) ? 0 : appointmentDate.hashCode());
	result = prime * result + appointmentNo;
	result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
	result = prime * result + ((mail == null) ? 0 : mail.hashCode());
	result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
	result = prime * result + ((pacentName == null) ? 0 : pacentName.hashCode());
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
	if (appointmentNo != other.appointmentNo)
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
	if (mobileNo == null) {
		if (other.mobileNo != null)
			return false;
	} else if (!mobileNo.equals(other.mobileNo))
		return false;
	if (pacentName == null) {
		if (other.pacentName != null)
			return false;
	} else if (!pacentName.equals(other.pacentName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Appaintment [appointmentNo=" + appointmentNo + ", appointmentDate=" + appointmentDate + ", doctor=" + doctor
			+ ", pacentName=" + pacentName + ", mobileNo=" + mobileNo + ", mail=" + mail + "]";
}

}
