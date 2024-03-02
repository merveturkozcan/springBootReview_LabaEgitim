package com.merveturk.springClassLaba.constructorInjection;

public class MysqlDB implements InterfaceDatabase {
    public String conn;

    public MysqlDB(String connection) {
        this.conn = connection;
    }

    @Override
    public void Report() {
        System.out.println("send report mysql");

    }
}
