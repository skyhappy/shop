package com.ispmj.lv.manager.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispmj.base.pageutil.Page;
import com.ispmj.base.util.JsonHelp;
import com.ispmj.lv.manager.service.ICustomerService;
import com.ispmj.lv.manager.vo.Customer;
import com.ispmj.lv.manager.vo.CustomerQuery;
/**客户简单管理模板
 * @author piaomingjie
 * @ 负责客户简单的增删改查等操作**/
@Controller
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	private ICustomerService iCustomerService=null;
	@RequestMapping(value="toadd.do")
	public String toadd(){
		return "customer/add";
	}
	@RequestMapping(value="add.do")
	public String add(@ModelAttribute("customer")Customer customer){
		customer.setRegisterTime(new java.sql.Date(new java.util.Date().getTime()).toString());
		iCustomerService.addCustomer(customer);
		return "customer/success";
	}
	/**调到修改页面*/
	@RequestMapping(value="toUpdate/{customerUuid}.do")
	public String toUpdate(Model model,@PathVariable("customerUuid") Integer customerUuid){
		Customer customer=iCustomerService.getById(customerUuid);
		model.addAttribute("customer", customer);
		return "customer/update";
		
	}
	/**执行修改*/
	@RequestMapping(value="update/{customerUuid}.do")
	public String update(Model model,@ModelAttribute("customer")Customer customer){
		iCustomerService.update(customer);
		model.addAttribute("customer", customer);
		return "redirect:/customer/toList.do"; 
		
	}
	
	
	@RequestMapping(value="toDelete/{customerUuid}.do",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("customerUuid") int customerUuid){
		iCustomerService.delete(customerUuid);
		 return "redirect:/customer/toList.do"; 
	}
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int customerUuid){
		iCustomerService.delete(customerUuid);
		return "customer/success";
	}
	
	@RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "customer/query";
	}
	/**@author piaomingjie
	 * show 方法说明
	 * <p>show:用于查询</p>*/
	@RequestMapping(value="toList.do")
	public String toList(Model model,@ModelAttribute("custuerWebModel")CustuerWebModel custuerWebModel){
		CustomerQuery customerQuery=null;
		if(StringUtils.isBlank(custuerWebModel.getJsonStrQuery())){
			customerQuery=new CustomerQuery();
		}else{
			customerQuery=(CustomerQuery) JsonHelp.str2Object(custuerWebModel.getJsonStrQuery(), CustomerQuery.class);
		}
		customerQuery.getPage().setNowPage(custuerWebModel.getNowPage());
		
		Page pageDb=iCustomerService.getByConditionPage(customerQuery);
		
		model.addAttribute("page", pageDb);
		return "customer/list";
	}
}

