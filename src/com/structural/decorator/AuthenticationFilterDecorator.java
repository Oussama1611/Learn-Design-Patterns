package com.structural.decorator;
// Decorator
public abstract class AuthenticationFilterDecorator implements AuthenticationFilter {
    protected AuthenticationFilter authenticationFilter;

    public AuthenticationFilterDecorator(AuthenticationFilter authenticationFilter) {
        this.authenticationFilter = authenticationFilter;
    }

    @Override
    public void authenticate(String username, String password) {
        authenticationFilter.authenticate(username, password);
    }
}
