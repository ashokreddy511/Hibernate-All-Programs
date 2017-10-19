package com.cs.entity;

public class Student {
	private int studentNo;
	private String studentName;
	private String contactNo;
	private String mail;
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result
				+ ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studentNo;
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
		Student other = (Student) obj;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentNo != other.studentNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName="
				+ studentName + ", contactNo=" + contactNo + ", mail=" + mail
				+ "]";
	}
	
}
