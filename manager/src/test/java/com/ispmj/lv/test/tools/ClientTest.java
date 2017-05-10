package com.ispmj.lv.test.tools;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.ispmj.lv.manager.Client;
import com.ispmj.lv.manager.Dao.CustomerDao;
import com.ispmj.lv.manager.vo.Customer;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer=new Customer("100000", "123456", "piaomj", "piaomingjie", "18746031956", "mingjie..123", "23052319911110081X", new Date().toString());
		///System.out.println((int)((Math.random()*9+1)));  
		/*customer.setCard(card);*/
		Client c=(Client) applicationContext.getBean("client");
	
		
		
	}
}
