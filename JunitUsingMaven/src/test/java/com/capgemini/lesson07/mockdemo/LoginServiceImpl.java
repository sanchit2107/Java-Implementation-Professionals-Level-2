package com.capgemini.lesson07.mockdemo;

public class LoginServiceImpl implements LoginService {

	
		private UserDAO userDao;
		public void setUserDao(UserDAO userDao){
			this.userDao = userDao;
		}
		public boolean login(String username, String password) {
		boolean valid=false;
		try{
			 User user = userDao.loadByUserNameAndPassword(username, password);
			 if(user != null) valid = true;
		}
		catch(Exception e){}
			return valid;
	}

}
