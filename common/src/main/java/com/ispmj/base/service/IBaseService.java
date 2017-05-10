package com.ispmj.base.service;

import java.util.List;

import com.ispmj.base.Dao.BaseDao;
import com.ispmj.base.pageutil.Page;
import com.ispmj.base.vo.BaseModel;

public class IBaseService<M,Q extends BaseModel<M>> implements BaseService<M, Q> {
	
	private BaseDao baseDao=null;
	
	
	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public void addCustomer(M m) {
		// TODO Auto-generated method stub
		baseDao.addCustomer(m);
	}

	public void update(M m) {
		// TODO Auto-generated method stub
		baseDao.update(m);
	}

	public void delete(int uuid) {
		// TODO Auto-generated method stub
		baseDao.delete(uuid);
	}

	public M getById(int uuid) {
		// TODO Auto-generated method stub
		
		return (M)baseDao.getById(uuid);
	}

	public Page<M> getByConditionPage(Q customerQuery) {
		// TODO Auto-generated method stub
		List<M> lsit=baseDao.getByConditionPage(customerQuery);
		customerQuery.getPage().setResult(lsit);;
		return customerQuery.getPage();
	}

}
