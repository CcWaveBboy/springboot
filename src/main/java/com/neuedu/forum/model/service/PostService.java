package com.neuedu.forum.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.forum.model.bean.Information;
import com.neuedu.forum.model.mapper.PostMapper;

@Service
public class PostService {

	@Autowired
	public PostMapper postMapper;
	
	public Information selectPostByPostid(int postid){
		return postMapper.selectPostByPostid(postid);
	};
	
	public List<Information> selectCommentByPostid(int postid){
		return postMapper.selectCommentByPostid(postid);
	};
}
