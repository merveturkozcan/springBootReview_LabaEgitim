package com.merveturk.springClassLaba.EJBYapisi;

public class OracleDB implements InterfaceDatabase {

    public String conn;

    public OracleDB(String connection) {
        this.conn = connection;
    }

    @Override
    public void Report() {
        System.out.println("send report oracle ");

    }
}
