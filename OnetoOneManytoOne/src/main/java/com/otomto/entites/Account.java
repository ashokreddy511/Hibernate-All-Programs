package com.otomto.entites;

import java.util.Date;

public class Account {
	protected int accountNo;
	protected Date OpenDate;
	protected String contactPerson;
	protected String contactNo;
	protected String email_Address;
	protected Organization organization;
	
	
	
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Date getOpenDate() {
		return OpenDate;
	}
	public void setOpenDate(Date openDate) {
		OpenDate = openDate;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail_Address() {
		return email_Address;
	}
	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((OpenDate == null) ? 0 : OpenDate.hashCode());
		result = prime * result + accountNo;
		result = prime * result
				+ ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result
				+ ((contactPerson == null) ? 0 : contactPerson.hashCode());
		result = prime * result
				+ ((email_Address == null) ? 0 : email_Address.hashCode());
		result = prime * result
				+ ((organization == null) ? 0 : organization.hashCode());
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
		if (OpenDate == null) {
			if (other.OpenDate != null)
				return false;
		} else if (!OpenDate.equals(other.OpenDate))
			return false;
		if (accountNo != other.accountNo)
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (contactPerson == null) {
			if (other.contactPerson != null)
				return false;
		} else if (!contactPerson.equals(other.contactPerson))
			return false;
		if (email_Address == null) {
			if (other.email_Address != null)
				return false;
		} else if (!email_Address.equals(other.email_Address))
			return false;
		if (organization == null) {
			if (other.organization != null)
				return false;
		} else if (!organization.equals(other.organization))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", OpenDate=" + OpenDate
				+ ", contactPerson=" + contactPerson + ", contactNo="
				+ contactNo + ", email_Address=" + email_Address
				+ ", organization=" + organization + "]";
	}
	
	
}
