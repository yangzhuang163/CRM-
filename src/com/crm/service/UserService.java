package com.crm.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.crm.common.utils.PageBean;
import com.crm.pojo.User;


public interface UserService {
	public PageBean<User> findAllUsers(int pageCode,int pageSize);
	public List<User> findAllUsers();
	public void insertUser(User user);
	public void deleteUser(Integer id);
	public List<User> findUserByName(String name);
	public void updateUser(User user);
	public User findUserByCode(String code);
	public User findUserById(String code);
	public int AllUsersNum();
}
