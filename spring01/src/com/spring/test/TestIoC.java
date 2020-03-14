package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.UserDao;

public class TestIoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ļ�
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=(UserDao) applicationContext.getBean("userDao");
		userDao.say();
		
//		���������
//		System.out.println(applicationContext.getBean("userDao"));
//		System.out.println(applicationContext.getBean("userDao"));
//		System.out.println(applicationContext.getBean("userDao"));
	}

}
