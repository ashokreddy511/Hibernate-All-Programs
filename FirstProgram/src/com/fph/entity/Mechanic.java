package com.fph.entity;

public class Mechanic {
	protected int mechanicNo;
	protected String mechanicName;
	protected String lastName;
	protected String specialization;
	protected int experience;
	protected String contantNo;
	protected String emailaddress;
	@Override
	public String toString() {
		return "Mechanic [mechanicNo=" + mechanicNo + ", mechanicName="
				+ mechanicName + ", lastName=" + lastName + ", specialization="
				+ specialization + ", experience=" + experience
				+ ", contantNo=" + contantNo + ", emailaddress=" + emailaddress
				+ "]";
	}
	public int getMechanicNo() {
		return mechanicNo;
	}
	public void setMechanicNo(int mechanicNo) {
		this.mechanicNo = mechanicNo;
	}
	public String getMechanicName() {
		return mechanicName;
	}
	public void setMechanicName(String mechanicName) {
		this.mechanicName = mechanicName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getContantNo() {
		return contantNo;
	}
	public void setContantNo(String contantNo) {
		this.contantNo = contantNo;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
}
