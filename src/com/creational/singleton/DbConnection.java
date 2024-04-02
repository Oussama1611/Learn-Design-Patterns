package com.creational.singleton;

public class DbConnection {
    private static DbConnection con;

    private DbConnection() {
    }

    public static DbConnection getInstance() {
        System.out.println("New connection to db");
        if ( con == null){
            con = new DbConnection();
            System.out.println("First Instance");
        }
        else System.out.println("Didn't instantiate this time");
        return con;
    }

}
