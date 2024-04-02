package com.structural.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        MySQLDB mysqldb = new MySQLDB();
        OracleDB oracledb = new OracleDB();

        JDBC mysqlDriver = new MySQLDriver(mysqldb);
        JDBC oracleDriver = new OracleDriver(oracledb);

        mysqlDriver.getConnection("jdbc:mysql://localhost:3306/mydatabase?","myuser","mypassword");
        mysqlDriver.executeQuery("SELECT id FROM table");
        mysqlDriver.commit();


        oracleDriver.getConnection("jdbc:oracle:thin:@hostname:1521:sid","sys","oracle");
        oracleDriver.executeQuery("DELETE FROM table WHERE id=12");
        oracleDriver.rollback();
    }
}
