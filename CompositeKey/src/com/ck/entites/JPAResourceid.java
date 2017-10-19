package com.ck.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class JPAResourceid implements Serializable{
	private int resouceNo;
	private int projectNo;
	@Column(name="ResouceNO")
	public void setResouceNo(int resouceNo) {
		this.resouceNo = resouceNo;
	}
	@Column(name="ProjectNo")
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	@Override
	public String toString() {
		return "JPAResourceid [resouceNo=" + resouceNo + ", projectNo="
				+ projectNo + "]";
	}
	
}
