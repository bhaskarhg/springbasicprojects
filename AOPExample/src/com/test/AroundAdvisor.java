package com.test;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj;
		System.out.println("additional corner before advice");
		obj = mi.proceed();
		System.out.println("additional corner after advice");
		return obj;
	}

}
