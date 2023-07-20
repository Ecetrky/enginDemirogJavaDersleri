package oopWithNlayeredApp;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.logging.DatabaseLogger;
import oopWithNlayeredApp.core.logging.FileLogger;
import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.core.logging.MailLogger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.entities.Product;

import java.util.List;

public class Main {

    //maini arayüz olarak düşün. business(productManager) ile user interface arasında
    // iletişim sağlar.

    public static void main(String[] args) throws Exception {
        Product product1 =new Product(1,"IPhone XR",10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
        //BURADA new ProductManager yaparken içine parametre vermemizi istiyor. bana ProductDao interfaceinin tutabildiği bi şey gönder diyor.
        //çünkü ProductManager classında ProductDaonun constructorunu çağırdık.
        // o yüzden içeriye new dbcPrductDao ya da HibernateProductDao gönderebiliriz, hangisi kullanılacaksa.

        /*
       1. Sanki ekranda bir ürün girmişiz gibi product aldık.sonra onu işbirimine yolluyoruz kurallara uygun mu diye.
       2. işbirimi kurallarını işletiyor. uymuyorsa hata veriyor
       3. uyuyorsa veritabanına ekliyor
        */

    }
}
