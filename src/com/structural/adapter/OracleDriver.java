package com.structural.adapter;
// This is the adapter
public class OracleDriver implements JDBC{
    private final OracleDB oracleDB;

    public OracleDriver(OracleDB oracleDB) {
        this.oracleDB = oracleDB;
    }

    @Override
    public void getConnection(String url, String user, String password) {
        oracleDB.connect(user+"/"+password+"@//"+url);
    }

    @Override
    public void createStatement() {
        oracleDB.createStatement();
    }

    @Override
    public void commit() {
        oracleDB.commit();
    }

    @Override
    public void rollback() {
        oracleDB.rollback();
    }

    @Override
    public void executeQuery(String sql) {
        if(oracleDB.execute(sql))
            System.out.println("Commit or rollback |");
        else rollback();
    }
}
