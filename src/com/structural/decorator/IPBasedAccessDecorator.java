package com.structural.decorator;
// Another concrete decorator
public class IPBasedAccessDecorator extends AuthenticationFilterDecorator {
    public IPBasedAccessDecorator(AuthenticationFilter authenticationFilter) {
        super(authenticationFilter);
    }

    @Override
    public void authenticate(String username, String password) {
        System.out.println("Performing IP-based access control for user: " + username);
        super.authenticate(username, password);
    }
}