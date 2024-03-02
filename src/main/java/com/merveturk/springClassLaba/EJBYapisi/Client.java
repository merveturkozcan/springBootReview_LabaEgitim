package com.merveturk.springClassLaba.EJBYapisi;

public class Client {

    /**
     * Database rapprlama sistemi yapılacak.
     * 3 farklı database'im var. ORacle, MySql, PostgreSQL
     * Bu databaselerin hepsinin raprlama detayları farklı.
     * ORacle üzerinde müşteri bilgisi, MySql üzerinde ürün bilgisi, PostgreSQl üzerinde ise hata logları tutuluyor.
     *
     * @param args
     */

    // bu kurdugumuz mimari yapıda class lar birbirine sıkı sıkıya baglı yani
    // dependcy injection mimarisi kullanılmamış.
    // Bu yapı ejb mimarisinde kullanılıyordu .
    //
    // Örneğin ConnectionService katmanında bulunan
    // connection metoduna bir parametre eklenirse bundan
    // diğer classlar da etkileneck.
    //
    //
    // Ve bu spring mimarisinde isteneyen bir durum bunun yerine Dependcy Injection kullanacagız.
    public static void main(String[] args) {

        ReporterService reporterService = new ReporterService();
        reporterService.reportOracleDB();


    }
}
