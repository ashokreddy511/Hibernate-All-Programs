package com.hb.trans;

public class Advisor {
	private int advisorNo;
	private String firstName;
	private String lastName;
	private String qualification;
	@Override
	public String toString() {
		return "Advisor [advisorNo=" + advisorNo + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", qualification=" + qualification
				+ ", Experience=" + Experience + ", contactNo=" + contactNo
				+ ", emailAddress=" + emailAddress + "]";
	}
	public int getAdvisorNo() {
		return advisorNo;
	}
	public void setAdvisorNo(int advisorNo) {
		this.advisorNo = advisorNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	private String Experience;
	private String contactNo;
	private String emailAddress;
	

}
