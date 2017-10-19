package com.cs.entity;

public class College {
	private int collegeCode;
	private int studentNo;
	private String collegeName;
	private String Address;
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + collegeCode;
		result = prime * result
				+ ((collegeName == null) ? 0 : collegeName.hashCode());
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
		College other = (College) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (collegeCode != other.collegeCode)
			return false;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (studentNo != other.studentNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "College [collegeCode=" + collegeCode + ", studentNo="
				+ studentNo + ", collegeName=" + collegeName + ", Address="
				+ Address + "]";
	}
	
	
}
