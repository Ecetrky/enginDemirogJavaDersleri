package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    //dao: data access object----VERİTABANI NESNESİ

    public void add(Product product) {

        //Sadece ve sadece database erişim kodları buraya yazılır. Bunun için SQL bilmek gerekir


        //veritabanına ürün eklemek için
        //Product tipinde product nesnesini parametre verdik
        //o paketi import eder

        System.out.println("JDBC ile veritabanına eklendi.");
    }


}
