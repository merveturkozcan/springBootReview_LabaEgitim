package com.merveturk.springClassLaba.constructorInjection;

public class ReporterService {

    ConnectionService connectionService;
    OracleDB oracleDB;

    public ReporterService(ConnectionService connectionService) {
        this.connectionService = connectionService;
        // constructor injection yöntemi :
        // connection servıce parametre olarak ınject edılmıstir.
    }


    public void reportOracleDB() {

        oracleDB.Report();
        String oracleCon = connectionService.connection("ORACLE");
        oracleDB = new OracleDB(oracleCon);

    }

    public void reportMysqlDB() {

    }

    public void reportPostgreDB() {

    }


}

