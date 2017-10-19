package com.tpsca.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CARD_PAYMENT")
@PrimaryKeyJoinColumn(name="CARD_PAYMENT_NO")
public class CardPayment extends Payment {
	@Column(name="CARD_NO")
	private int cardNo;
	@Column(name="CARD_TYPE")
	private String cardType;
	@Column(name="CARD_HOLDER_NAME")
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
