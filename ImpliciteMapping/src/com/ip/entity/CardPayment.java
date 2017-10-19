package com.ip.entity;

public class CardPayment extends Payment{
protected int cardNo;
protected String cardHOlder;
protected String cardType;
public int getCardNo() {
	return cardNo;
}
public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
}
public String getCardHOlder() {
	return cardHOlder;
}
public void setCardHOlder(String cardHOlder) {
	this.cardHOlder = cardHOlder;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
@Override
public String toString() {
	return "CardPayment [cardNo=" + cardNo + ", cardHOlder=" + cardHOlder
			+ ", cardType=" + cardType + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}


}
