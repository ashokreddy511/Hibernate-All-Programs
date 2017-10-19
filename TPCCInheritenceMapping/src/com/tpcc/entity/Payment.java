package com.tpcc.entity;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable{
protected int paymentNo;
protected String discription;
protected float amount;
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
	result = prime * result + ((paidDate == null) ? 0 : paidDate.hashCode());
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
	return "Payment [paymentNo=" + paymentNo + ", discription=" + discription
			+ ", amount=" + amount + ", paidDate=" + paidDate + "]";
}


}
