package com.tpcca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_PAYMENT")
public class CardPayment extends Payment {
	@Column(name = "CARD_NO")
	protected int cardNo;
	@Column(name = "CARD_HOLDER")
	protected String cardHOlder;
	@Column(name = "CARD_TYPE")
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
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
