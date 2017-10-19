package com.tpcca.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="CHECK_PAYMENT")

public class CheckPayment extends Payment{
	@Column(name="CHECK_NO")
	protected int chackNo;
	@Column(name="ISSUE_BANK")
	protected String issuedBank;
	@Column(name="CHACK_DT")
	protected Date checkDate;
	public int getChackNo() {
		return chackNo;
	}
	public void setChackNo(int chackNo) {
		this.chackNo = chackNo;
	}
	public String getIssuedBank() {
		return issuedBank;
	}
	public void setIssuedBank(String issuedBank) {
		this.issuedBank = issuedBank;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	@Override
	public String toString() {
		return "CheckPayment [chackNo=" + chackNo + ", issuedBank="
				+ issuedBank + ", checkDate=" + checkDate + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
