package com.netease.Spring_Transaction;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		AccountDao dao =  context.getBean("accountDao", AccountDao.class);
		dao.resetMoney();
		try {
			dao.transferMoney("LiLei", "HanMeimei", 521);
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Account> accountList = dao.accountList();
		for(Account account : accountList) {
			System.out.println(account.getUser() + ": " + account.getBalance());
		}
		((ConfigurableApplicationContext)context).close();
		
	}

}
