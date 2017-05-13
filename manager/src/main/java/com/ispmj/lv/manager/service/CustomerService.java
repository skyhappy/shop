package com.ispmj.lv.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispmj.base.service.BaseService;
import com.ispmj.lv.manager.Dao.CustomerDao;
import com.ispmj.lv.manager.vo.Customer;
import com.ispmj.lv.manager.vo.CustomerQuery;
@Transactional
@Service
public class CustomerService extends BaseService<Customer, CustomerQuery> implements ICustomerService{
	@Autowired
	private CustomerDao customerDao;
	/**添加方法*//*
	public void addCustomer()*/

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
}
