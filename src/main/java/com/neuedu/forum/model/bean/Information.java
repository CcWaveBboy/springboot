package com.neuedu.forum.model.bean;

public class Information {

	private int userid;
	private String username;
	private String userlevel;
	private String password;
	private String personalSignature;
	private String sex;
	private String imgurl;
	private String email;
	private String mobile;
	private int prestigei;
	private int numberofPosts;
	private Post post;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPersonalSignature() {
		return personalSignature;
	}
	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getPrestigei() {
		return prestigei;
	}
	public void setPrestigei(int prestigei) {
		this.prestigei = prestigei;
	}
	public int getNumberofPosts() {
		return numberofPosts;
	}
	public void setNumberofPosts(int numberofPosts) {
		this.numberofPosts = numberofPosts;
	}
	
	public String getUserlevel() {
		return userlevel;
	}
	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
}
