package com.capgemini.training.service;

import com.capgemini.training.exceptions.BusineesException;
import com.capgemini.training.model.Login;

public interface LoginService {

	public Login loginUser(String email, String pass) throws BusineesException;
	public void addUser(Login login) throws BusineesException;
	public int updatePassword(String oldPassword, String newPassword, String email) throws BusineesException;
}
