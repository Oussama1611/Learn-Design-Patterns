package com.structural.adapter;
// This is the adaptee
public class OracleDB extends Database{
    public void connect(String connString) {
        System.out.println("Connected to Oracle database");
    }

    public void createStatement() {
        System.out.println("New Statement created from Oracle");
    }

    public void commit() {
        System.out.println("Transaction Committed");
    }

    public void rollback() {
        System.out.println("Rollback");
    }

    public boolean execute(String query) {
        System.out.println("\""+query + "\""
                    + " is executed");
        return true;
    }
}
