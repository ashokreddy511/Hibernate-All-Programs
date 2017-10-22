package com.oto.entites;

import java.util.Date;

public class Evaluvation {
	protected int candidateNo;
	protected Date evaluvationDate;
	protected String interviewerName;
	protected String rating;
	protected Candidate candidate;
	public int getCandidateNo() {
		return candidateNo;
	}
	public void setCandidateNo(int candidateNo) {
		this.candidateNo = candidateNo;
	}
	public Date getEvaluvationDate() {
		return evaluvationDate;
	}
	public void setEvaluvationDate(Date evaluvationDate) {
		this.evaluvationDate = evaluvationDate;
	}
	public String getInterviewerName() {
		return interviewerName;
	}
	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + candidateNo;
		result = prime * result
				+ ((evaluvationDate == null) ? 0 : evaluvationDate.hashCode());
		result = prime * result
				+ ((interviewerName == null) ? 0 : interviewerName.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
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
		Evaluvation other = (Evaluvation) obj;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		if (candidateNo != other.candidateNo)
			return false;
		if (evaluvationDate == null) {
			if (other.evaluvationDate != null)
				return false;
		} else if (!evaluvationDate.equals(other.evaluvationDate))
			return false;
		if (interviewerName == null) {
			if (other.interviewerName != null)
				return false;
		} else if (!interviewerName.equals(other.interviewerName))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Evaluvation [candidateNo=" + candidateNo + ", evaluvationDate="
				+ evaluvationDate + ", interviewerName=" + interviewerName
				+ ", rating=" + rating + ", candidate=" + candidate + "]";
	}
	
	
		
}
