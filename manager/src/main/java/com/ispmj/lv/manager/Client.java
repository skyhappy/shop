package com.ispmj.lv.manager;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ispmj.lv.manager.Dao.CustomerDao;
import com.ispmj.lv.manager.service.ICustomerService;
import com.ispmj.lv.manager.vo.Customer;
import com.ispmj.lv.manager.vo.CustomerQuery;
@Component
public class Client {
	@Autowired
	private ICustomerService iCustomerService;
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer=new Customer("100007", "123456", "piaomj", "piaomingjie", "18746031956", "mingjie..123", "23052319911110081X",new java.sql.Date(new java.util.Date().getTime()).toString());
		Client c=(Client) app.getBean("client");
	//	c.customerDao.addCustomer(customer);
/*		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
*//*		Customer customer=new Customer("100000", "123456", "piaomj", "piaomingjie", "18746031956", "mingjie..123", "23052319911110081X", new Date().toString());
*/		///System.out.println((int)((Math.random()*9+1)));  
		/*customer.setCard(card);*/
	/*	*/
		/*c.customerDao.addCustomer(customer);*/
		System.out.println(c.iCustomerService);
		c.iCustomerService.addCustomer(customer);
	/*	List list=	c.customerDao.getByConditionPage(cq);*/
/*		cq.getPage().setResult(list);
		System.out.println(cq.getPage());*/
	}
}
