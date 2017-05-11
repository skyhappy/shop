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
@Controller
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	private ICustomerService iCustomerService=null;
	@RequestMapping(value="toadd.do")
	public String toadd(){
		return "customer/add";
	}
	@RequestMapping(value="add")
	public String add(@ModelAttribute("customer")Customer customer){
		iCustomerService.addCustomer(customer);
		return "customer/success";
	}
	@RequestMapping(value="toUpdate/{customerUuid}")
	public String toUpdate(Model model,@PathVariable("customerUuid") Integer customerUuid){
		Customer customer=iCustomerService.getById(customerUuid);
		return "customer/update";
		
	}
	@RequestMapping(value="toDelete/{customerUuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("customerUuid") int customerUuid){
		Customer customer = iCustomerService.getById(customerUuid);
		model.addAttribute("cm", customer);
		return "customer/delete";
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
	public String toList(Model model,@RequestParam("queryJsonStr") String queryJsonStr,@ModelAttribute("page") Page page){
		CustomerQuery customerQuery=null;
		if(StringUtils.isEmpty(queryJsonStr)){
			customerQuery=new CustomerQuery();
		}else{
			customerQuery=(CustomerQuery) JsonHelp.str2Object(queryJsonStr, CustomerQuery.class);
		}
		customerQuery.getPage().setNowPage(page.getNowPage());
		Page pageDb=customerQuery.getPage();
		model.addAttribute("page", "pageDb");
		return "customer/list";
	}
}

