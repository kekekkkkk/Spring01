package com.spring.service.dao.Impl;

import com.spring.dao.UserDao;
import com.spring.service.dao.UserService;

public class UserServiceImpl implements UserService {

//	构造方法注入
//	1.添加依赖的对象属性
	private UserDao userDao;
//	2.构造方法注入，用于实现依赖注入接口对象（添加有参构造函数）
	public UserServiceImpl(UserDao userDao) {
		this.userDao=userDao;
	}
	
	
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		this.userDao.say();
		System.out.println("userService say method 1!");
	}

}
