package com.cap.bean;

public class User {
	private String uid;
	private String uname;
	private String password;
	private String userType;
	public User(){}
	public User(String uid, String uname, String password, String userType) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.userType = userType;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
