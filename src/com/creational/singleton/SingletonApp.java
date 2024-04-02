package com.creational.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        DbConnection con = DbConnection.getInstance();
        DbConnection con1 = DbConnection.getInstance();
        System.out.println(con == con1);

    }
}
