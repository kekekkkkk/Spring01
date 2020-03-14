package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.dao.UserService;

public class TestDI {

//	方法1：构造方法方法注入	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//加载配置文件
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService:方法1 构造方法注入
//		UserService userService=(UserService) applicationContext.getBean("userService");
		
//		userService:方法1 Setter方法注入		
		UserService userService=(UserService) applicationContext.getBean("userService2");
		userService.say();
		
	}
}
