package com.structural.decorator;
// Concrete decorator
public class RoleBasedAccessDecorator extends AuthenticationFilterDecorator {
    public RoleBasedAccessDecorator(AuthenticationFilter authenticationFilter) {
        super(authenticationFilter);
    }

    @Override
    public void authenticate(String username, String password) {
        System.out.println("Performing role-based access control for user: " + username);
        super.authenticate(username, password);
    }
}
