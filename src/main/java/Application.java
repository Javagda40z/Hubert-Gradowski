import bramka.Bramka;
import bramka.KalkulatorOplat;
import bramka.Raport;
import bramka.RejestrPojazdow;
import pojazdy.Autobus;
import pojazdy.Motocykl;
import pojazdy.Paliwo;
import pojazdy.Samochod;

public class Application {

    public static void main(String[] args) {

//        Sprawdzanie czy jest miejsce,
//        Sprawdzanie czy rejestracja jest poprawna - statyczna metoda w util
//        Stworz nowy kalkulator oplat,
//        jezeli ktos jest na parkingu nie zmieniac kalkulatora oplat
//        stosowac stary kalkulator oplat dla pojazdow ktore wjechaly
//        wydawanie reszty
//        wzywanie policji
//        zmienna oplata w zaleznosci od godziny
//        zmiana oplaty w zaleznosci od paliwa
//        tworzenie pdf z raportem (lub do pliku)
//        co zostalo na parkingu

        RejestrPojazdow rejestrPojazdow = new RejestrPojazdow();
        Bramka bramka = new Bramka(rejestrPojazdow);
        bramka.setKalkulatorOplat(new KalkulatorOplat());

        Motocykl motocykl = new Motocykl("GD12345", Paliwo.BENZYNA);
        Samochod samochod = new Samochod("GD12311", Paliwo.GAZ);
        Autobus autobus = new Autobus("GD12331", Paliwo.ROPA);

        bramka.wjazd(motocykl);
        bramka.wjazd(samochod);
        bramka.wjazd(autobus);

        bramka.wyjazd(samochod, 10);
        bramka.wyjazd(autobus,20);

        Raport raport = bramka.przygotujRaport();

        raport.wyswietl(); // Raczej powinna byc klasa do wyswietlania raportu

    }

}
