package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.dao.UserService;

public class TestDI {

//	����1�����췽������ע��	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������ļ�
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService:����1 ���췽��ע��
//		UserService userService=(UserService) applicationContext.getBean("userService");
		
//		userService:����1 Setter����ע��		
		UserService userService=(UserService) applicationContext.getBean("userService2");
		userService.say();
		
	}
}
