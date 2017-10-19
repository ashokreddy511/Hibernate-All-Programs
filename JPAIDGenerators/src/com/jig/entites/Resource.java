package com.jig.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/*
 * COLUMN NAME IS SAME AS ATTRIBUTE WE CANNOT PROVIDE ANITATION IT OPTIONAL
 * DEFAULT ALL THE ATTRIBUTES ARE PRESISTABLE BECAUSE @BASIC(FEATCH=FEATCH-TYPE.EAGER/FETCHTYPE.LAZY
 * IF WE CAN NOT GIVE THE PRESISTENCE FOR ATTREBUTE WE CAN USE @TRANSIENT
 * WE CAN MADE AS TWO ATTRIBUTES ARE COMBINATIONALY UNIC we can use uniqueConstraints with in the @table
 * annotations are provided in two ways at getter level and attribute level recommended by getter level 
 */
@Entity
@Table(name = "Resource")
// @Access(javax.persistence.AccessType.PROPERTY/javax.persistence.AccessType.FIELD) Deprecated at 5.x 
public class Resource {
	@Id
	// @Basic(fetch=FetchType.EAGER);
	@Column(name = "resourceNo")
	/*@GeneratedValue(strategy=GenerationType.TABLE)*/
	@GeneratedValue(generator="hilo")
	@TableGenerator(name="hilo",pkColumnName="max_lo",pkColumnValue="5")
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="resouce_seq")
	@SequenceGenerator(name="resouce_seq",sequenceName="resouce_seq")*/
	private int resourceNo;
	@Column(name = "res_st_dt")
	private Date res_st_dt;
//	@Transient
	@Column(name = "role")
	private String role;
	@Column(name = "percentage")
	private int percentage;
	public int getResourceNo() {
		return resourceNo;
	}
	public void setResourceNo(int resourceNo) {
		this.resourceNo = resourceNo;
	}
	public Date getRes_st_dt() {
		return res_st_dt;
	}
	public void setRes_st_dt(Date res_st_dt) {
		this.res_st_dt = res_st_dt;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + percentage;
		result = prime * result
				+ ((res_st_dt == null) ? 0 : res_st_dt.hashCode());
		result = prime * result + resourceNo;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		Resource other = (Resource) obj;
		if (percentage != other.percentage)
			return false;
		if (res_st_dt == null) {
			if (other.res_st_dt != null)
				return false;
		} else if (!res_st_dt.equals(other.res_st_dt))
			return false;
		if (resourceNo != other.resourceNo)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Resource [resourceNo=" + resourceNo + ", res_st_dt="
				+ res_st_dt + ", role=" + role + ", percentage=" + percentage
				+ "]";
	}


}
