package com.spring.service.dao.Impl;

import com.spring.dao.UserDao;
import com.spring.service.dao.UserService;

public class UserServiceImpl2 implements UserService {

//	Setter方法注入
	
//  1.添加依赖的对象属性
  private UserDao userDao;
//	2.给对象属性添加Setter方法
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		this.userDao.say();
		System.out.println("userService2 say method 2!");
	}
}
