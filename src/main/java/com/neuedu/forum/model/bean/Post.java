package com.neuedu.forum.model.bean;

import java.sql.Timestamp;

public class Post {

	private int postid;
	private String title;
	private int userid;
	private Timestamp datetime;
	private int numberofreplies;
	private int good;
	private int bad;
	
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Timestamp getDatetime() {
		return datetime;
	}
	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}
	public int getNumberofreplies() {
		return numberofreplies;
	}
	public void setNumberofreplies(int numberofreplies) {
		this.numberofreplies = numberofreplies;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
	
}
