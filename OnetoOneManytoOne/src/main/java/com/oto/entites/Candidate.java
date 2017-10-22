package com.oto.entites;

import java.io.Serializable;
import java.util.Date;

public class Candidate implements Serializable {
	protected int candidateNo;
	protected String candidateName;
	protected String applyFor;
	protected Date apperDate;
	protected String contactNo;
	protected String email_Addess;

	public int getCandidateNo() {
		return candidateNo;
	}

	public void setCandidateNo(int candidateNo) {
		this.candidateNo = candidateNo;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getApplyFor() {
		return applyFor;
	}

	public void setApplyFor(String applyFor) {
		this.applyFor = applyFor;
	}

	public Date getApperDate() {
		return apperDate;
	}

	public void setApperDate(Date apperDate) {
		this.apperDate = apperDate;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail_Addess() {
		return email_Addess;
	}

	public void setEmail_Addess(String email_Addess) {
		this.email_Addess = email_Addess;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apperDate == null) ? 0 : apperDate.hashCode());
		result = prime * result
				+ ((applyFor == null) ? 0 : applyFor.hashCode());
		result = prime * result
				+ ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + candidateNo;
		result = prime * result
				+ ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result
				+ ((email_Addess == null) ? 0 : email_Addess.hashCode());
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
		Candidate other = (Candidate) obj;
		if (apperDate == null) {
			if (other.apperDate != null)
				return false;
		} else if (!apperDate.equals(other.apperDate))
			return false;
		if (applyFor == null) {
			if (other.applyFor != null)
				return false;
		} else if (!applyFor.equals(other.applyFor))
			return false;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (candidateNo != other.candidateNo)
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (email_Addess == null) {
			if (other.email_Addess != null)
				return false;
		} else if (!email_Addess.equals(other.email_Addess))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidate [candidateNo=" + candidateNo + ", candidateName="
				+ candidateName + ", applyFor=" + applyFor + ", apperDate="
				+ apperDate + ", contactNo=" + contactNo + ", email_Addess="
				+ email_Addess + "]";
	}

}
