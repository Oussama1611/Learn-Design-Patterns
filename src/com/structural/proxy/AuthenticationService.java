package com.structural.proxy;

public class AuthenticationService {
    public boolean authenticate(String user, String password) {
        return user.equals("admin") && password.equals("password");
    }
}
