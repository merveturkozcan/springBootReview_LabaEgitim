package com.merveturk.springClassLaba.constructorInjection;

public class Client {

    /**
     * Database rapprlama sistemi yapılacak.
     * 3 farklı database'im var. ORacle, MySql, PostgreSQL
     * Bu databaselerin hepsinin raprlama detayları farklı.
     * ORacle üzerinde müşteri bilgisi, MySql üzerinde ürün bilgisi, PostgreSQl üzerinde ise hata logları tutuluyor.
     *
     * @param args
     */


    public static void main(String[] args) {

        ConnectionService connectionService = new ConnectionService("test");
        ReporterService reporterService = new ReporterService(connectionService);

        reporterService.reportOracleDB();
        reporterService.reportMysqlDB();
        reporterService.reportPostgreDB();

    }
}
