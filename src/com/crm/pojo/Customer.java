package com.crm.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cust_id;
	private String cust_name;
	private Integer cust_create_id;
	private String cust_source;
	private String cust_industry;
	private String cust_level;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	private String cust_zipcode;
	private String cust_address;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date cust_createtime;
	private Integer start;
	private Integer rows;
	
	
	
	public Customer() {
		super();
	}

	public Customer(Integer cust_id, String cust_name, Integer cust_create_id, String cust_source,
			String cust_industry, String cust_level, String cust_linkman, String cust_phone, String cust_mobile,
			String cust_zipcode, String cust_address, Date cust_createtime, Integer start, Integer rows) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_create_id = cust_create_id;
		this.cust_source = cust_source;
		this.cust_industry = cust_industry;
		this.cust_level = cust_level;
		this.cust_linkman = cust_linkman;
		this.cust_phone = cust_phone;
		this.cust_mobile = cust_mobile;
		this.cust_zipcode = cust_zipcode;
		this.cust_address = cust_address;
		this.cust_createtime = cust_createtime;
		this.start = start;
		this.rows = rows;
	}

	public String getCust_zipcode() {
		return cust_zipcode;
	}

	public void setCust_zipcode(String cust_zipcode) {
		this.cust_zipcode = cust_zipcode;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	

	public Integer getCust_create_id() {
		return cust_create_id;
	}

	public void setCust_create_id(Integer cust_create_id) {
		this.cust_create_id = cust_create_id;
	}

	public String getCust_source() {
		return cust_source;
	}

	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}

	public String getCust_industry() {
		return cust_industry;
	}

	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}

	public String getCust_level() {
		return cust_level;
	}

	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}

	public String getCust_linkman() {
		return cust_linkman;
	}

	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}

	public String getCust_phone() {
		return cust_phone;
	}

	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	public String getCust_mobile() {
		return cust_mobile;
	}

	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}

	public Date getCust_createtime() {
		return cust_createtime;
	}

	public void setCust_createtime(Date cust_createtime) {
		this.cust_createtime = cust_createtime;
	}

}