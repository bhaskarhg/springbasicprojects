package com.test;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("additional concern before actual logic");  
        System.out.println("method info:"+arg0.getName()+" "+arg0.getModifiers());  
        System.out.println("argument info:");  
        for(Object arg:arg1)  
            System.out.println(arg);  
        System.out.println("target Object:"+arg2);  
        System.out.println("target object class name: "+arg2.getClass().getName());  
		
	}

}
