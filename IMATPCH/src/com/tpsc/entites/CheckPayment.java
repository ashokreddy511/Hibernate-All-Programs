package com.tpsc.entites;

import java.util.Date;

public class CheckPayment extends Payment {
	private int checkNo;
	private Date checkDate;
	private String issueBank;
	private String checkAccountNo;

	public int getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getIssueBank() {
		return issueBank;
	}

	public void setIssueBank(String issueBank) {
		this.issueBank = issueBank;
	}

	public String getCheckAccountNo() {
		return checkAccountNo;
	}

	public void setCheckAccountNo(String checkAccountNo) {
		this.checkAccountNo = checkAccountNo;
	}

	@Override
	public String toString() {
		return "CheckPayment [checkNo=" + checkNo + ", checkDate=" + checkDate
				+ ", issueBank=" + issueBank + ", checkAccountNo="
				+ checkAccountNo + ", getPaymentNo()=" + getPaymentNo()
				+ ", getDiscription()=" + getDiscription() + ", getAmount()="
				+ getAmount() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}

}
