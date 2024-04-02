package com.structural.adapter;
// This is the adaptee
public class MySQLDB extends Database{

    public void connect(String url, String user, String password) {
        System.out.println("Connected to MySQL database");
    }

    public void createStatement() {
        System.out.println("New Statement created from MySQL");
    }

    public void commit() {
        System.out.println("Transaction Committed");
    }

    public void rollback() {
        System.out.println("Rollback");
    }

    public void execute(String query) {
        System.out.println("\""+query +"\""+ " is executed");
    }

    public boolean checkSyntaxQuery(String query){
        System.out.println("MySQL Syntax is Good");
        return true;
    }
}
