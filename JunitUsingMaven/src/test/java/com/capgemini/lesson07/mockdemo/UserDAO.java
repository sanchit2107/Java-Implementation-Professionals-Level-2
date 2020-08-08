package com.capgemini.lesson07.mockdemo;

public interface UserDAO {
User loadByUserNameAndPassword(String username, String password);
}
