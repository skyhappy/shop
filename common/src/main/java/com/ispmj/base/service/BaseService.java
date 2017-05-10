package com.ispmj.base.service;

import java.util.List;

import com.ispmj.base.pageutil.Page;

public interface BaseService <M,Q>{
	public  void addCustomer(M m);
	public  void update(M m);
	public  void delete(int uuid);
	public M getById(int uuid);
	public Page<M> getByConditionPage(Q customerQuery);

}
