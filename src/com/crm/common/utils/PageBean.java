package com.crm.common.utils;

import java.util.List;

public class PageBean<T> {
	private int pageCode; //��ǰҳ��
	private int totalPage; //��ҳ��
	private int totalRecord; //�ܼ�¼��
	private int pageSize; //ÿҳ��¼��
	private List<T> beanList; //ʵ������
	
	
	
	public int getPageCode() {
		return pageCode;
	}
	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
	//������ҳ��
	public int getTotalPage() {
		//�ܼ�¼��/ÿҳ��¼��
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
