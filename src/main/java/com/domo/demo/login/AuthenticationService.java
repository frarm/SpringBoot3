package com.domo.demo.login;

import org.springframework.stereotype.Service;

/**
 * AuthenticationService
 */
@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("frarm");
        boolean isValidPassword = password.equalsIgnoreCase("password");

        return isValidUserName && isValidPassword;
    }
}