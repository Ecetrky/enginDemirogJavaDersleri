package inheritance;

public class Main {
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new TarimKredi());
        //newleyerek eklemek istediğimiz her class için bu kodu çalıştırabiliriz.
        //bu polimorfizmdir. örn askerler için kredi çıkarılacak. askerkredi sınıfı oluşturup
        //baseclass a extend edip burada newleyerek kullanabiliriz

    }
}
