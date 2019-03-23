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
		//���Դ��룬����̶�	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.����һ��sqlSession����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.ʵ����һ��sqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.��ȡһ��mapper����
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.ͨ��ӳ����󣬶�Ӧӳ�䷽����ʵ�ֹ���
			User stu = new User("zs10088","","����","888888","15998562420",1,"N");
			mapper.insertUser(stu);
			//5.�ύ����
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void findAllUsers(){
		//���Դ��룬����̶�	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.����һ��sqlSession����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.ʵ����һ��sqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.��ȡһ��mapper����
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.ͨ��ӳ����󣬶�Ӧӳ�䷽����ʵ�ֹ���
			
			//List<User> findAllUsers = mapper.findAllUsers();
		//	System.out.println(findAllUsers);
			/*//5.�ύ����
			sqlSession.commit();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void deleteUser(){
		//���Դ��룬����̶�	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.����һ��sqlSession����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.ʵ����һ��sqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.��ȡһ��mapper����
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.ͨ��ӳ����󣬶�Ӧӳ�䷽����ʵ�ֹ���
			
			mapper.deleteUser(7);
			
			//5.�ύ����
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void findUserByName(){
		//���Դ��룬����̶�	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.����һ��sqlSession����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.ʵ����һ��sqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.��ȡһ��mapper����
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.ͨ��ӳ����󣬶�Ӧӳ�䷽����ʵ�ֹ���
			
			List<User> findUserByName = mapper.findUserByName("zs");
			System.out.println(findUserByName);
			/*//5.�ύ����
			sqlSession.commit();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void updateUser(){
		//���Դ��룬����̶�	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.����һ��sqlSession����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.ʵ����һ��sqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.��ȡһ��mapper����
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.ͨ��ӳ����󣬶�Ӧӳ�䷽����ʵ�ֹ���
			User stu = new User(8,"zs10086","���޸�","66@qq.com","162827",0);
			mapper.updateUser(stu);
			//5.�ύ����
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void findUserByCode(){
		//���Դ��룬����̶�	
		try {		
			InputStream is = Resources.getResourceAsStream("mybatis/mybatis-Config.xml");
			//1.����һ��sqlSession����
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			
			//2.ʵ����һ��sqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			//3.��ȡһ��mapper����
			UserDao mapper = sqlSession.getMapper(UserDao.class);
			
			//4.ͨ��ӳ����󣬶�Ӧӳ�䷽����ʵ�ֹ���
			User user = mapper.findUserByCode("admin");
			System.out.println(user);
			/*//5.�ύ����
			sqlSession.commit();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
