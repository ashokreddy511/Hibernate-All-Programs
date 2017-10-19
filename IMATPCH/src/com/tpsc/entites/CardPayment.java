package com.tpsc.entites;

public class CardPayment extends Payment {
	private int cardNo;
	private String cardType;
	private String cardHolderName;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardType=" + cardType
				+ ", cardHolderName=" + cardHolderName + ", getPaymentNo()="
				+ getPaymentNo() + ", getDiscription()=" + getDiscription()
				+ ", getAmount()=" + getAmount() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}

	

}
