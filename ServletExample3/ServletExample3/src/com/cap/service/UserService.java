package com.cap.service;

import com.cap.bean.User;
import com.cap.dao.UserDao;

public class UserService {
	UserDao ud=new UserDao();
	public String createUser(User u){
		if(u.getUid().length()<1 || u.getPassword().length()<4)
			return "Invalid Data";
		else
			return ud.addUser(u);
	}
	public User validateLigin(String uid,String pass){
		if(uid.length()<5)
			return null;
		else
			return ud.validUser(uid, pass);
	}
}
