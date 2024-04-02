package com.structural.adapter;
// This is the adapter
public class MySQLDriver implements JDBC {
    private final MySQLDB mySQLDB;

    public MySQLDriver(MySQLDB mySQLDB) {
        this.mySQLDB = mySQLDB;
    }

    @Override
    public void getConnection(String url, String user, String password) {
        mySQLDB.connect(url, user, password);
    }

    @Override
    public void createStatement() {
        mySQLDB.createStatement();
    }

    @Override
    public void commit() {
        mySQLDB.commit();
    }

    @Override
    public void rollback() {
        mySQLDB.rollback();
    }

    @Override
    public void executeQuery(String sql) {
        if (mySQLDB.checkSyntaxQuery(sql))
            mySQLDB.execute(sql);
    }
}
