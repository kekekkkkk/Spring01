package com.spring.service.dao.Impl;

import com.spring.dao.UserDao;
import com.spring.service.dao.UserService;

public class UserServiceImpl implements UserService {

//	���췽��ע��
//	1.��������Ķ�������
	private UserDao userDao;
//	2.���췽��ע�룬����ʵ������ע��ӿڶ�������вι��캯����
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
