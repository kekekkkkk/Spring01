package com.spring.service.dao.Impl;

import com.spring.dao.UserDao;
import com.spring.service.dao.UserService;

public class UserServiceImpl2 implements UserService {

//	Setter����ע��
	
//  1.��������Ķ�������
  private UserDao userDao;
//	2.�������������Setter����
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
