package com.merveturk.springClassLaba.constructorInjection;

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
