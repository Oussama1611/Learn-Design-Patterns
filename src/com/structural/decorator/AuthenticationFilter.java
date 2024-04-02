package com.structural.decorator;
// Component interface
public interface AuthenticationFilter {
    void authenticate(String username, String password);
}