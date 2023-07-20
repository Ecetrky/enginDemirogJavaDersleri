package oopWithNlayeredApp.core.logging;

public interface Logger {
    void log (String data);

    //Sistemde loglama yapacak bir kod. string datayı alıp ya DATABASEe ya text formatında ya da elasticsearch(clouda)
    //yazabiliriz. önce imzamızı aldık. yani söylüyoruz, hepsi buna uyacak
}
