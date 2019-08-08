package com.neuedu.forum.model.bean;

public class Comment {

	private int commentid;
	private int userid;
	private int postid;
	private String comments;
	private String commenttime;
	private Information information;
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCommenttime() {
		return commenttime;
	}
	public void setCommenttime(String commenttime) {
		this.commenttime = commenttime;
	}
	public Information getInformation() {
		return information;
	}
	public void setInformation(Information information) {
		this.information = information;
	}
}
