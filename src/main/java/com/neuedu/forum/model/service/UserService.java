package com.neuedu.forum.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.forum.model.bean.Information;
import com.neuedu.forum.model.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	//注册
	@Transactional
	public void insertUser(Information i){
		userMapper.insertUser(i);
	}

}
