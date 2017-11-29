package com.netease.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
/*		Calculate calculate = context.getBean("calculate", Calculate.class);
		calculate.add(1, 2);
		calculate.sub(5, 2);*/
		UserService userService = context.getBean("userSerivce", UserService.class);
		userService.Insert(1);
		userService.Select(2);
		userService.Update(3);
		userService.Delete(4);
		((ConfigurableApplicationContext)context).close();
		
	}

}
