package com.sp.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * COLUMN NAME IS SAME AS ATTRIBUTE WE CANNOT PROVIDE ANITATION IT OPTIONAL
 * DEFAULT ALL THE ATTRIBUTES ARE PRESISTABLE BECAUSE @BASIC(FEATCH=FEATCH-TYPE.EAGER/FETCHTYPE.LAZY
 * IF WE CAN NOT GIVE THE PRESISTENCE FOR ATTREBUTE WE CAN USE @TRANSIENT
 * WE CAN MADE AS TWO ATTRIBUTES ARE COMBINATIONALY UNIC we can use uniqueConstraints with in the @table
 * annotations are provided in two ways at getter level and attribute level recommended by getter level 
 */
@Entity
@Table(name = "SPAREPART")
// @Access(javax.persistence.AccessType.PROPERTY/javax.persistence.AccessType.FIELD) Deprecated at 5.x 
public class Sparepart {
	@Id
	// @Basic(fetch=FetchType.EAGER);
	@Column(name = "SPAREPART_NO")
	private int sparepartNo;
	@Column(name = "SPAREPART_NM")
	private String sparepartNm;
//	@Transient
	@Column(name = "MODEL_NO")
	private String modelNo;
	@Column(name = "PURCHASE_DT")
	private Date purchaseDt;
	@Column(name="PRICE")
	private int price;

	public int getSparepartNo() {
		return sparepartNo;
	}

	public void setSparepartNo(int sparepartNo) {
		this.sparepartNo = sparepartNo;
	}

	public String getSparepartNm() {
		return sparepartNm;
	}

	public void setSparepartNm(String sparepartNm) {
		this.sparepartNm = sparepartNm;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public Date getPurchaseDt() {
		return purchaseDt;
	}

	public void setPurchaseDt(Date purchaseDt) {
		this.purchaseDt = purchaseDt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
