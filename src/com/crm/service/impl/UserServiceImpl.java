package com.crm.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.common.utils.PageBean;
import com.crm.mapper.UserDao;
import com.crm.pojo.User;
import com.crm.service.UserService;

import cn.itcast.commons.CommonUtils;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public User findUserByCode(String code) {		
		User user = userDao.findUserByCode(code);			
		return user;
	}
	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
	@Override
	public PageBean<User> findAllUsers(int pageCode,int pageSize) {	
		RowBounds rowBounds = new RowBounds((pageCode-1)*pageSize,pageSize);		
		List<User> users = userDao.findAllUsers(rowBounds);
		PageBean<User> pageBean = new PageBean<User>();
		pageBean.setPageCode(pageCode);
		pageBean.setPageSize(pageSize);
		pageBean.setBeanList(users);
		int totalRecord = userDao.AllUsersNum();
		pageBean.setTotalRecord(totalRecord);
		return pageBean;
	}
	@Override
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
		
	}
	@Override
	public List<User> findUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);		
	}
	@Override
	public User findUserById(String code) {
		User user = userDao.findUserById(code);	
		return user;
	}
	@Override
	public int AllUsersNum() {
		return userDao.AllUsersNum();
	}
	public List<User> findAllUsers(){	
		return userDao.findAllUsers();
		
	}

}
