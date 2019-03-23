package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;

public interface CustomerDao {
	/**
	 * 根据queryVo分页查询数据
	 * 
	 * @param queryVo
	 * @return
	 */
	List<Customer> queryCustomerByQueryVo(QueryVo queryVo,RowBounds rowBounds);
	/**
	 * 根据queryVo查询数据条数
	 * 
	 * @param queryVo
	 * @return
	 */
	int queryCountByQueryVo(QueryVo queryVo);

	List<Customer> selectCustomerList(Customer customer);
	
	Integer selectCustomerListCount(Customer customer);

	Customer getCustomerById(Long id);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);
	
	public void insertCustomer(Customer customer);

}