package com.tpcca.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PAYMENT")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides({@AttributeOverride(name="discription",column=@Column(name="INFORMATION"))})
public class Payment implements Serializable {
	@Id
	@Column(name = "PAYMENT_NO")
	@GeneratedValue(generator="resouce_seq")
	@GenericGenerator(name="resouce_seq",strategy="increment")
	
	/*@GeneratedValue(generator="user_ger")
	@GenericGenerator(strategy="user_ger",name="increment")*/
	protected int paymentNo;
	@Column(name = "DISCRIPTION")
	protected String discription;
	@Column(name = "AMOUNT")
	protected float amount;
	@Column(name = "PAID_DT")
	protected Date paidDate;

	public int getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result
				+ ((discription == null) ? 0 : discription.hashCode());
		result = prime * result
				+ ((paidDate == null) ? 0 : paidDate.hashCode());
		result = prime * result + paymentNo;
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
		Payment other = (Payment) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (discription == null) {
			if (other.discription != null)
				return false;
		} else if (!discription.equals(other.discription))
			return false;
		if (paidDate == null) {
			if (other.paidDate != null)
				return false;
		} else if (!paidDate.equals(other.paidDate))
			return false;
		if (paymentNo != other.paymentNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", discription="
				+ discription + ", amount=" + amount + ", paidDate=" + paidDate
				+ "]";
	}

}
