package com.tpsca.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="CHECK_PAYMENY")
@PrimaryKeyJoinColumn(name="CHECK_PAYMENT_NO")
public class CheckPayment extends Payment {
	@Column(name="CHECK_NO")
	private int checkNo;
	@Column(name="CHECK_DATE")
	private Date checkDate;
	@Column(name="ISSUE_BANK")
	private String issueBank;
	@Column(name="CHECK_ACCOUNT_NO")
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
