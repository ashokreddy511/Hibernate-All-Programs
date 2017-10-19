package com.ck.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Reosources")
public class JPAResource implements Serializable {
	@Id
	@Embedded
	private JPAResourceid id;
	private Date resAssign_state_dt;
	private Date resAssign_end_dt;
	private int app_percentage;
	public void setId(JPAResourceid id) {
		this.id = id;
	}
	public void setResAssign_state_dt(Date resAssign_state_dt) {
		this.resAssign_state_dt = resAssign_state_dt;
	}
	public void setResAssign_end_dt(Date resAssign_end_dt) {
		this.resAssign_end_dt = resAssign_end_dt;
	}
	public void setApp_percentage(int app_percentage) {
		this.app_percentage = app_percentage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + app_percentage;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((resAssign_end_dt == null) ? 0 : resAssign_end_dt.hashCode());
		result = prime
				* result
				+ ((resAssign_state_dt == null) ? 0 : resAssign_state_dt
						.hashCode());
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
		JPAResource other = (JPAResource) obj;
		if (app_percentage != other.app_percentage)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return true;
	}
	@Override
	public String toString() {
		return "JPAResource [id=" + id + ", resAssign_state_dt="
				+ resAssign_state_dt + ", resAssign_end_dt=" + resAssign_end_dt
				+ ", app_percentage=" + app_percentage + "]";
	}
	


}
