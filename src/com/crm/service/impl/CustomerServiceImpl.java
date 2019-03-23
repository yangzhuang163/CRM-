package com.crm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.common.utils.PageBean;
import com.crm.mapper.BaseDictDao;
import com.crm.mapper.CustomerDao;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.pojo.User;
import com.crm.service.CustomerService;

/**
 * 客户管理
 * 
 * @author lx
 *
 */

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	@SuppressWarnings("unused")
	@Autowired
	private BaseDictDao baseDictDao;


	@Override
	public Customer getCustomerById(Long id) {

		Customer customer = customerDao.getCustomerById(id);
		return customer;

	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);

	}

	@Override
	public void deleteCustomer(Long id) {
		customerDao.deleteCustomer(id);

	}

	@Override
	public PageBean<Customer> queryCustomerByQueryVo(QueryVo queryVo,int pageCode,int pageSize) {
		// 设置查询条件,从哪条数据开始查	
		// 查询数据结果
		RowBounds rowBounds = new RowBounds((pageCode-1)*pageSize,pageSize);
		
		List<Customer> list = this.customerDao.queryCustomerByQueryVo(queryVo,rowBounds);
		// 查询到的数据总条数
		int total = this.customerDao.queryCountByQueryVo(queryVo);

		/*// 封装返回的page对象
		Page<Customer> page = new Page<Customer>(total, rowBounds.getLimit(), rowBounds.getOffset(), list);*/
		PageBean<Customer> pageBean = new PageBean<Customer>();
		pageBean.setPageCode(pageCode);
		pageBean.setPageSize(pageSize);
		pageBean.setBeanList(list);
		pageBean.setTotalRecord(total);
		return pageBean;

	}

	@Override
	public void insertCustomer(Customer customer) {
		
		customerDao.insertCustomer(customer);	
	}

}
