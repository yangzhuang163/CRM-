package com.crm.common.utils;

import java.util.List;

public class PageBean<T> {
	private int pageCode; //当前页码
	private int totalPage; //总页数
	private int totalRecord; //总记录数
	private int pageSize; //每页记录数
	private List<T> beanList; //实例对象
	
	
	
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	//计算总页数
	public int getTotalPage() {
		//总记录数/每页记录数
		int tp=totalRecord/pageSize;
		return totalRecord%pageSize==0 ? tp : tp+1;
	}
		
	public int getTotalRecord() {	
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}
	
	
	
}
