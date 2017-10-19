package com.ja.service;

public class BankingService implements IBankingService {
	
	public String balance(String accountNO) {
		System.out.println("accountNo"+accountNO);
		return "balance"+240;
	}

	public String balance1(String accountNO) {
		System.out.println("accountNo"+accountNO);
		return "balance1:"+240;
	}
	
	

}
