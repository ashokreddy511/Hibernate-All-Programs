 package com.ck.entites;

import java.io.Serializable;
import java.util.Date;

public class ResouceAllocator implements Serializable {
	private int resouceNo;
	private int projectNo;
	private Date resAssign_state_dt;
	private Date resAssign_end_dt;
	private int app_percentage;
	public int getResouceNo() {
		return resouceNo;
	}
	public void setResouceNo(int resouceNo) {
		this.resouceNo = resouceNo;
	}
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public Date getResAssign_state_dt() {
		return resAssign_state_dt;
	}
	public void setResAssign_state_dt(Date resAssign_state_dt) {
		this.resAssign_state_dt = resAssign_state_dt;
	}
	public Date getResAssign_end_dt() {
		return resAssign_end_dt;
	}
	public void setResAssign_end_dt(Date resAssign_end_dt) {
		this.resAssign_end_dt = resAssign_end_dt;
	}
	public int getApp_percentage() {
		return app_percentage;
	}
	public void setApp_percentage(int app_percentage) {
		this.app_percentage = app_percentage;
	}
	@Override
	public String toString() {
		return "ResouceAllocator [resouceNo=" + resouceNo + ", projectNo="
				+ projectNo + ", resAssign_state_dt=" + resAssign_state_dt
				+ ", resAssign_end_dt=" + resAssign_end_dt
				+ ", app_percentage=" + app_percentage + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + app_percentage;
		result = prime * result + projectNo;
		result = prime
				* result
				+ ((resAssign_end_dt == null) ? 0 : resAssign_end_dt.hashCode());
		result = prime
				* result
				+ ((resAssign_state_dt == null) ? 0 : resAssign_state_dt
						.hashCode());
		result = prime * result + resouceNo;
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
		ResouceAllocator other = (ResouceAllocator) obj;
		if (app_percentage != other.app_percentage)
			return false;
		if (projectNo != other.projectNo)
			return false;
		if (resAssign_end_dt == null) {
			if (other.resAssign_end_dt != null)
				return false;
		} else if (!resAssign_end_dt.equals(other.resAssign_end_dt))
			return false;
		if (resAssign_state_dt == null) {
			if (other.resAssign_state_dt != null)
				return false;
		} else if (!resAssign_state_dt.equals(other.resAssign_state_dt))
			return false;
		if (resouceNo != other.resouceNo)
			return false;
		return true;
	}

		
}
