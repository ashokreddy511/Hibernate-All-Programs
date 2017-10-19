package com.gl.entite;

public class Advisor {
	private int advisorNo;
	private String FirstNm;
	private String LastNm;
	private String qualification;
	private int experiance;
	private String contentNo;
	private String emailaddress;
	public int getAdvisorNo() {
		return advisorNo;
	}
	public void setAdvisorNo(int advisorNo) {
		this.advisorNo = advisorNo;
	}
	public String getFirstNm() {
		return FirstNm;
	}
	public void setFirstNm(String firstNm) {
		FirstNm = firstNm;
	}
	public String getLastNm() {
		return LastNm;
	}
	public void setLastNm(String lastNm) {
		LastNm = lastNm;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String getContentNo() {
		return contentNo;
	}
	public void setContentNo(String contentNo) {
		this.contentNo = contentNo;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	@Override
	public String toString() {
		return "Advisor [advisorNo=" + advisorNo + ", FirstNm=" + FirstNm
				+ ", LastNm=" + LastNm + ", qualification=" + qualification
				+ ", experiance=" + experiance + ", contentNo=" + contentNo
				+ ", emailaddress=" + emailaddress + "]";
	}
	
	
}
