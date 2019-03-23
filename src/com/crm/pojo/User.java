package com.crm.pojo;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;


public class User implements Serializable{
	private static final long serialVersionUID = 6828291028845067123L;
	
	private Integer user_id;
	private String user_name;
	private String user_code;
	private String user_mail;
	private String user_password;
	private String user_phone;
	private Integer user_state;
	private String adminFlag;
	
	


	public User(Integer user_id,String user_code,String user_name, String user_mail, String user_phone, Integer user_state) {
		super();
		this.user_id=user_id;
		this.user_code=user_code;
		this.user_name = user_name;
		this.user_mail = user_mail;
		this.user_phone = user_phone;
		this.user_state = user_state;
	}



	public User() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_code=" + user_code + ", user_mail="
				+ user_mail + ", user_password=" + user_password + ", user_phone=" + user_phone + ", user_state="
				+ user_state + ", adminFlag=" + adminFlag + ", validateCode=" + "]";
	}



	public User(Integer user_id,String user_name, String user_phone) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_phone = user_phone;
	}


	public User(String user_name, String user_code, String user_mail, String user_password, String user_phone,
			Integer user_state, String adminFlag) {
		super();
		this.user_name = user_name;
		this.user_code = user_code;
		this.user_mail = user_mail;
		this.user_password = user_password;
		this.user_phone = user_phone;
		this.user_state = user_state;
		this.adminFlag = adminFlag;
	}


	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public Integer getUser_state() {
		return user_state;
	}
	public void setUser_state(Integer user_state) {
		this.user_state = user_state;
	}
	public String getAdminFlag() {
		return adminFlag;
	}
	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}




	public String getUser_mail() {
		return user_mail;
	}


	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	
	
}
