package com.crm.service;


import com.crm.common.utils.PageBean;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;

public interface CustomerService {


	public PageBean<Customer> queryCustomerByQueryVo(QueryVo queryVo, int pageCode,int pageSize);
	
	public Customer getCustomerById(Long id);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Long id);
	
	public void insertCustomer(Customer customer);
}
