package com.structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        AuthenticationFilter authenticationFilter = new BaseAuthenticationFilter();

        authenticationFilter = new RoleBasedAccessDecorator(authenticationFilter);

        authenticationFilter = new IPBasedAccessDecorator(authenticationFilter);

        authenticationFilter.authenticate("admin", "password");
    }

}
