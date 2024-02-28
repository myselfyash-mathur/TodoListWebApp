package com.firstwebapp.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("yash");
		boolean isValidPassword = password.equalsIgnoreCase("yash@123");
		return isValidUsername && isValidPassword;
	}
}
