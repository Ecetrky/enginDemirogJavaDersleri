package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.Product;

public interface ProductDao {
    void add(Product product);

    //ProductDao interface'i, onu implemente eden sınıfların referansını tutar. onun nesnesini oluşturabilir. yani newleyebilir.

    //implements PrdouctDao demek, JdbcProductDao aslında bir ProductDaodur(yani referansını tutar)
    // ve onun kurallarına uymak zorundadır. İÇİNDE NE VARSA ONLARI DOLDURMAK ZORUNDA


}
