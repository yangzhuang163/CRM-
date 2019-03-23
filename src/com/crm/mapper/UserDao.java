package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.crm.pojo.User;

public interface UserDao {
	public List<User> findAllUsers(RowBounds rowBounds);
	public List<User> findAllUsers();
	public void insertUser(User user);
	public void deleteUser(Integer id);
	public List<User> findUserByName(String name);
	public void updateUser(User user);
	public User findUserByCode(String code);
	public User findUserById(String code);	
	public int AllUsersNum();
}
