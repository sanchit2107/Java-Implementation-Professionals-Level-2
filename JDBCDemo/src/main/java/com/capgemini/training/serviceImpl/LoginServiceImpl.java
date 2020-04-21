package com.capgemini.training.serviceImpl;

import com.capgemini.training.daoimpl.LoginDaoImpl;
import com.capgemini.training.daos.LoginDao;
import com.capgemini.training.exceptions.BusineesException;
import com.capgemini.training.model.Login;
import com.capgemini.training.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	LoginDao loginDao = null;
	
	public LoginServiceImpl() {
		loginDao =  new LoginDaoImpl();
	}

	@Override
	public Login loginUser(String email, String pass)  throws BusineesException {
		return loginDao.loginUser(email, pass);
	}

	@Override
	public void addUser(Login login)  throws BusineesException {
		if(login.getLid()>000 && login.getLid()<999) {
			if(login.getEmail() != null &&  login.getEmail() .matches("[a-zA-Z0-9_]{5, 12}@cap.com")) {
				if(login.getPass() != null && login.getPass().matches("[a-zA-Z0-9]{8}")) {
					if(login.getRole().equalsIgnoreCase("admin") || login.getRole().equalsIgnoreCase("customer")) {
						loginDao.registerUser(login);
					}
					else {
						throw new BusineesException("Role allowed only admin and customer..");
					}
				}
				else {
					throw new BusineesException("Password pattern not matching.. Length is 8");
				}
			}
			else {
				throw new BusineesException("Email pattern not matching");
			}
		}
		else {
			throw new BusineesException("Only 3 digits are allowed..");
		}
	}

	@Override
	public int updatePassword(String oldPassword, String newPassword, String email)  throws BusineesException {
		
		return 0;
	}

}
