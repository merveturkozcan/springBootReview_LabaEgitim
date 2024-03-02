package com.merveturk.springClassLaba.EJBYapisi;

public class ReporterService {

    ConnectionService connectionService;

    public ReporterService() {

        connectionService = new ConnectionService();
    }

    public void reportOracleDB() {
        String oracleCon = connectionService.connection("ORACLE");
        OracleDB oracleDB = new OracleDB(oracleCon);
        oracleDB.Report();

    }

    public void reportMysqlDB() {

    }

    public void reportPostgreDB() {

    }


}

