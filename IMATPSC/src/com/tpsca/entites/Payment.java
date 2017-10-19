package com.tpsca.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment {
	@Id
	@Column(name="PAYMENT_NO")
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private int paymentNo;
	@Column(name="DISCIPTION")
	private String discription;
	@Column(name="AMOUNT")
	private float amount;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result
				+ ((discription == null) ? 0 : discription.hashCode());
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
		if (paymentNo != other.paymentNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", discription="
				+ discription + ", amount=" + amount + "]";
	}

}
