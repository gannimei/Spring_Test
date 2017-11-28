package com.netease.Spring_IOC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ScrewDriver screwDriver = context.getBean("screwDriver", ScrewDriver.class);
		screwDriver.use();
		((ConfigurableApplicationContext)context).close();*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CompactDisc cd = context.getBean(SgtPeppers.class);
		cd.play();
		context.close();
		
	}

}
