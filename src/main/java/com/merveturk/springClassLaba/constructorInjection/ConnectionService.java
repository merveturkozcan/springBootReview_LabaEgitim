package com.merveturk.springClassLaba.constructorInjection;

public class ConnectionService {

    public ConnectionService(String s) {
    }

    public String connection(String type) {

        if (type.equals("Oracle")) {
            return "oracle url";
        } else if (type.equals("Mysql")) {
            return "mysql url ";
        } else if (type.equals("Postgre")) {
            return "postgre url";
        }
        return null;
    }

}
