package com.ja.hanlder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*PROVIDEING THE ADITIONAL FUNCTIONALITY */

public class ServiceHandler implements InvocationHandler {
	Object objetc = null;

	public ServiceHandler(Object objetc) {
		this.objetc = objetc;
	}

	@Override
	public Object invoke(Object object, Method method, Object[] arg2)
			throws Throwable {

		if (method.getName().equals("balance")) {

			System.out.println("authontication-----");
		}

		return method.invoke(objetc, arg2);
	}
}
