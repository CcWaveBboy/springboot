package com.neuedu.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.forum.model.bean.Information;
import com.neuedu.forum.model.service.UserService;

import net.sf.json.JSONObject;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	//注册
	@RequestMapping("insertUser.do")
	@ResponseBody
	public String insertUser(Information i){
		System.out.println(i.getUsername());
		userService.insertUser(i);
		return "{\"result\",\"注册成功\"}";
	}

}
