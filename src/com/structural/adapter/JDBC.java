package com.structural.adapter;
// This is the target
public interface JDBC {
    void getConnection(String url, String user, String password);
    void createStatement();
    void commit();
    void rollback();
    void executeQuery(String sql);
}
