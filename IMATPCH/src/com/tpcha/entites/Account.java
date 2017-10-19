package com.tpcha.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="ACCOUNT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ACCOUNT_TYPE")
@DiscriminatorValue("ACCOUNT")
public class Account {
	@Id
	@Column(name="ACCOUNT_NO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int accountNo;
	@Column(name="ACCOUNT_hOLDER")
	protected String accountHolder;
	@Column(name="OPEN_DT")
	protected Date openDate;
	@Column(name="BALANCE")
	protected float balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountHolder == null) ? 0 : accountHolder.hashCode());
		result = prime * result + accountNo;
		result = prime * result + Float.floatToIntBits(balance);
		result = prime * result
				+ ((openDate == null) ? 0 : openDate.hashCode());
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
		Account other = (Account) obj;
		if (accountHolder == null) {
			if (other.accountHolder != null)
				return false;
		} else if (!accountHolder.equals(other.accountHolder))
			return false;
		if (accountNo != other.accountNo)
			return false;
		if (Float.floatToIntBits(balance) != Float
				.floatToIntBits(other.balance))
			return false;
		if (openDate == null) {
			if (other.openDate != null)
				return false;
		} else if (!openDate.equals(other.openDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolder="
				+ accountHolder + ", openDate=" + openDate + ", balance="
				+ balance + "]";
	}
		
	
}
