package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.crm.mapper.UserDao;
import com.crm.pojo.User;

public class UserTest {
	
	@Test
	public void insertUser(){
		//测试代码，步骤固定	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.构建一个sqlSession工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.实例化一个sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.获取一个mapper对象
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.通过映射对象，对应映射方法，实现功能
			User stu = new User("zs10088","","张五","888888","15998562420",1,"N");
			mapper.insertUser(stu);
			//5.提交事务
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void findAllUsers(){
		//测试代码，步骤固定	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.构建一个sqlSession工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.实例化一个sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.获取一个mapper对象
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.通过映射对象，对应映射方法，实现功能
			
			//List<User> findAllUsers = mapper.findAllUsers();
		//	System.out.println(findAllUsers);
			/*//5.提交事务
			sqlSession.commit();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void deleteUser(){
		//测试代码，步骤固定	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.构建一个sqlSession工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.实例化一个sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.获取一个mapper对象
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.通过映射对象，对应映射方法，实现功能
			
			mapper.deleteUser(7);
			
			//5.提交事务
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void findUserByName(){
		//测试代码，步骤固定	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.构建一个sqlSession工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.实例化一个sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.获取一个mapper对象
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.通过映射对象，对应映射方法，实现功能
			
			List<User> findUserByName = mapper.findUserByName("zs");
			System.out.println(findUserByName);
			/*//5.提交事务
			sqlSession.commit();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void updateUser(){
		//测试代码，步骤固定	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.构建一个sqlSession工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.实例化一个sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.获取一个mapper对象
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.通过映射对象，对应映射方法，实现功能
			User stu = new User(8,"zs10086","被修改","66@qq.com","162827",0);
			mapper.updateUser(stu);
			//5.提交事务
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void findUserByCode(){
		//测试代码，步骤固定	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.构建一个sqlSession工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.实例化一个sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.获取一个mapper对象
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.通过映射对象，对应映射方法，实现功能
			User user = mapper.findUserByCode("admin");
			System.out.println(user);
			/*//5.提交事务
			sqlSession.commit();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
