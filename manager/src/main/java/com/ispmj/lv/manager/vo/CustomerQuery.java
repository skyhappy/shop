package com.ispmj.lv.manager.vo;

import java.awt.List;

import com.ispmj.base.pageutil.Page;

public class CustomerQuery extends Customer {
	private Page<Customer> page=new Page<Customer>();

	public Page<Customer> getPage() {
		return page;
	}

	public void setPage(Page<Customer> page) {
		this.page = page;
	}
	
}
