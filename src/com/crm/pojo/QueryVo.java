package com.crm.pojo;

public class QueryVo {

	private String cust_Name;//客户名称(公司名称)
	private String cust_Source;//客户信息来源
	private String cust_Industry;//客户所属行业
	private String cust_Level;//客户级别

	

	public QueryVo(String cust_Name, String cust_Source, String cust_Industry, String cust_Level) {
		super();
		this.cust_Name = cust_Name;
		this.cust_Source = cust_Source;
		this.cust_Industry = cust_Industry;
		this.cust_Level = cust_Level;
	}

	public String getcust_Name() {
		return cust_Name;
	}

	public void setcust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getcust_Source() {
		return cust_Source;
	}

	public void setcust_Source(String cust_Source) {
		this.cust_Source = cust_Source;
	}

	public String getcust_Industry() {
		return cust_Industry;
	}

	public void setcust_Industry(String cust_Industry) {
		this.cust_Industry = cust_Industry;
	}

	public String getcust_Level() {
		return cust_Level;
	}

	public void setcust_Level(String cust_Level) {
		this.cust_Level = cust_Level;
	}

}
