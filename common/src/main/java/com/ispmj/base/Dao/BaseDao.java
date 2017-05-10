package com.ispmj.base.Dao;

import java.util.List;

public interface BaseDao<M,Q> {
	public  void addCustomer(M m);
	public  void update(M m);
	public  void delete(int uuid);
	public M getById(int uuid);
	public List<M> getByConditionPage(Q customerQuery);
}
