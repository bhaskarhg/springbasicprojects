package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("springapplication.xml");
//		A a=ac.getBean("proxy",A.class);  
//	    a.m();

//		Resource r = new ClassPathResource("springapplication.xml");
//		BeanFactory factory = new XmlBeanFactory(r);

		Validator v = factory.getBean("proxy", Validator.class);
		try {
			v.validate(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
