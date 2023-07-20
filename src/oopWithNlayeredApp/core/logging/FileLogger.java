package oopWithNlayeredApp.core.logging;

public class FileLogger implements Logger {
    //DOSYAYA LOGLAMA CLASSI
    //Logger interface'ini implemente ettiysen onun içinde belirtilen metodları doldurman lazım
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı:" + data);
    }
}
