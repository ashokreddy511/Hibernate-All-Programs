package com.ja.test;

import java.lang.reflect.Proxy;

import com.ja.hanlder.ServiceHandler;
import com.ja.service.BankingService;
import com.ja.service.IBankingService;

public class JATest {
	public static void main(String[] args) {
		
		IBankingService ibanking = null;
		ServiceHandler sh = null;
		
		
		ibanking = new BankingService();
		sh = new ServiceHandler(ibanking);

		// System.out.println(Proxy.getInvocationHandler(ibanking));
		/*
		 * create the proxy and give the original object and hander class object
		 */
		ibanking = (IBankingService) Proxy.newProxyInstance(
				JATest.class.getClassLoader(),
				new Class[] { IBankingService.class }, sh);

		System.out.println(ibanking.balance("ac76"));
		System.out.println(ibanking.balance1("ac65"));

	}
}
