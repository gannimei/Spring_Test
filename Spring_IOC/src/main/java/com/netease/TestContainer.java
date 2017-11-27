package com.netease;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ScrewDriver screwDriver = context.getBean("screwDriver", ScrewDriver.class);
		screwDriver.use();
		((ConfigurableApplicationContext)context).close();
		
	}

}
