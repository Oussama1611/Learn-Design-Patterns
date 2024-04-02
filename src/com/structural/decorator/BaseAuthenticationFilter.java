package com.structural.decorator;
// Concrete component
public class BaseAuthenticationFilter implements AuthenticationFilter {
    @Override
    public void authenticate(String username, String password) {
        System.out.println("Authenticating user: " + username);
        if ("admin".equals(username) && "password".equals(password)) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");
        }
    }
}
