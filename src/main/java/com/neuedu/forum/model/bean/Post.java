package com.neuedu.forum.model.bean;


public class Post {

	private int postid;
	private String title;
	private int userid;
	private String imgurl;
	private String posttxt;
	private String postingtime;
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
	public String getPosttxt() {
		return posttxt;
	}
	public void setPosttxt(String posttxt) {
		this.posttxt = posttxt;
	}

	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getPostingtime() {
		return postingtime;
	}
	public void setPostingtime(String postingtime) {
		this.postingtime = postingtime;
	}
	
}
