package com.ispmj.lv.manager.Dao;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.ispmj.base.Dao.BaseDao;
import com.ispmj.lv.manager.vo.Customer;
import com.ispmj.lv.manager.vo.CustomerQuery;
@Repository
public interface CustomerDao extends BaseDao<Customer, CustomerQuery> {
	
}	
