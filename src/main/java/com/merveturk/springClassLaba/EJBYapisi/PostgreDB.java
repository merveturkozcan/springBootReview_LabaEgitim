package com.merveturk.springClassLaba.EJBYapisi;

public class PostgreDB implements InterfaceDatabase {
    public String conn;

    public PostgreDB(String connection) {
        this.conn = connection;
    }

    @Override
    public void Report() {
        System.out.println("send report mysql");

    }
}
