package com.netease.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Calculate calculate = context.getBean("calculate", Calculate.class);
		calculate.add(1, 2);
		calculate.sub(5, 2);
		((ConfigurableApplicationContext)context).close();
		
	}

}
