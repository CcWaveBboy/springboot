package com.neuedu.forum.model.mapper;

import java.util.List;
import com.neuedu.forum.model.bean.Information;

public interface PostMapper {

	public Information selectPostByPostid(int postid);
	public List<Information> selectCommentByPostid(int postid);
}
