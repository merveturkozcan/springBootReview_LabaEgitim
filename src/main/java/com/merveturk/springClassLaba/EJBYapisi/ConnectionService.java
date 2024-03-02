package com.merveturk.springClassLaba.EJBYapisi;

public class ConnectionService {

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
