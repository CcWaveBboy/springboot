package com.neuedu.forum.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.forum.model.bean.Information;
import com.neuedu.forum.model.service.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;
	
	
	@RequestMapping("selectPostByPostid/{postid}")
	@ResponseBody
	public Information selectPostByPostid(@PathVariable int postid){
		
		return postService.selectPostByPostid(postid);
	};
	
	@RequestMapping("selectCommentByPostid/{postid}")
	@ResponseBody
	public List<Information> selectCommentByPostid(@PathVariable int postid){
		return postService.selectCommentByPostid(postid);
	}
}
