package oopWithNlayeredApp.business;

import oopWithNlayeredApp.core.logging.Logger;
import oopWithNlayeredApp.dataAccess.ProductDao;
import oopWithNlayeredApp.entities.Product; //entities kullanılıyor çünkü entities yardımcı katman


public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    //bir Logger koleksıyon listesi göndericem

    //thıs demek, bu class demek bu classın içindeki loggers(this.logger) = gönderilen loggerlardır(loggers)

    // productmanager newlendiğinde bana bir productdao ver demek
    //üstteki interfacein constructorını oluşturuyoruz böylece ProductManager classının bağımlılığı sadece bu interface'e oluyor
    //jdbc veya hibernate fark etmeiyor artık. SADECE INTERFACE BAĞLILIĞI VAR. BUNA NUZLLY COUPLED GEVŞEK BAĞLILIK DENİR
    //thıs demek, bu class demek, bu classın içindeki loggers(this.logger) = gönderilen loggerlardır(loggers)
    public ProductManager(ProductDao productDao, Logger[] loggers ) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    //iş kuralları yazılır.
    public void add(Product product) throws Exception  {
        //bana bir product ver, ben de onunla ilgili iş kurallarını yazayım. Aynı TC no iki kez bulunamaz vs.
//        if (product.getUnitPrice()<10) {
//            throw new Exception("Ürünün fiyatı 10dan küçük olamaz..");
//        }
            //üst kısım kötü kod tekniği. öğrenme ahgfda

        //ProductDao interface'i, onu implemente eden sınıfların referansını tutar. onun nesnesini oluşturabilir. yani newleyebilir.

        //BİR KATMAN BAŞKA BİR KATMANIN CLASSINI KULLANIYORKEN SADECE INTERFACEINDEN ERİŞİM KURALIDIR.(ENTITIES HARİÇ, O ÖZELLİK CLASSI)
        //O YÜZDEN, ALTTAKİ KOD İYİ BİR KOD DEĞİLDİR.

//       ProductDao productDao = new JdbcProductDao();
//       productDao.add(product); //dataa accesse gidip onun add'ini çağırdık

        productDao.add(product);

        for(Logger logger : loggers){ //bu polimorfizmdir [DB,MAİL]->for döngüsünde, Logger arraylistindeki tüm loggersları dolaşır ve yazdırır
            //tüm loggerları çalıştırıcaz forecah ile
            logger.log(product.getName());
        }


    }
}
