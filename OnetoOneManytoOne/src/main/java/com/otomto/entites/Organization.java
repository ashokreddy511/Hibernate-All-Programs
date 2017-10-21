package com.otomto.entites;

import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable {
	protected int organizationNo;
	protected String OrganizationName;
	protected String description;
	protected Date establishingDate;
	protected String businessType;
	public int getOrganizationNo() {
		return organizationNo;
	}
	public void setOrganizationNo(int organizationNo) {
		this.organizationNo = organizationNo;
	}
	public String getOrganizationName() {
		return OrganizationName;
	}
	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getEstablishingDate() {
		return establishingDate;
	}
	public void setEstablishingDate(Date establishingDate) {
		this.establishingDate = establishingDate;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	@Override
	public String toString() {
		return "Organization [organizationNo=" + organizationNo
				+ ", OrganizationName=" + OrganizationName + ", description="
				+ description + ", establishingDate=" + establishingDate
				+ ", businessType=" + businessType + "]";
	}
	
	
	
}
