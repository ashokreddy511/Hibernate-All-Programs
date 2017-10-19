package com.ip.entity;

import java.util.Date;

public class CheckPayment extends Payment{
	protected int chackNo;
	protected String issuedBank;
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
