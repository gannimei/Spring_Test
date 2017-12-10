package com.netease.Spring_JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		JDBCTemplateDAO dao = context.getBean("jdbcTemplateDao", JDBCTemplateDAO.class);
		//dao.InsertData();
		System.out.println(dao.count());
		List<User> userList = dao.getUserList();
		for(User user : userList) {
			System.out.println(user.getId() + ": " + user.getFirstName() + " " + user.getLastName());
		}
		((ConfigurableApplicationContext)context).close();
		
	}

}
