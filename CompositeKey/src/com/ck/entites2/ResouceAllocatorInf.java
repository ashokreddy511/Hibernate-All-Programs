package com.ck.entites2;

import java.io.Serializable;

public class ResouceAllocatorInf implements Serializable{
	private int resouceNo;
	private int projectNo;
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
	
	
}
