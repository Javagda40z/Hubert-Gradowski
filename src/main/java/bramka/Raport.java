package bramka;

import pojazdy.Pojazd;
import pojazdy.Typ;

import java.util.EnumMap;
import java.util.Map;

public class Raport {

    private int zarobek;
    private int koszt;
    private Map<Typ, Integer> licznikPojazdow = new EnumMap<Typ, Integer>(Typ.class);


    public void dodajKase(int kasa){
     zarobek += kasa;
    }

    public void dodajKoszt(int koszt){
        this.koszt += koszt;
    }

    public void dodajPojazd(Pojazd pojazd){
        if (licznikPojazdow.containsKey(pojazd.getTyp())) {
            Integer licznik = licznikPojazdow.get(pojazd.getTyp());
            licznik++;
            licznikPojazdow.put(pojazd.getTyp(), licznik);
        }else {
            licznikPojazdow.put(pojazd.getTyp(), 1);
        }
//        mozna tez tak:
//        licznikPojazdow.compute(pojazd.getTyp(), (k,v) -> 1 + (v == null ? 0 : v ));

    }

    public int getKoszt() {
        return koszt;
    }

    public int getZarobek() {
        return zarobek;
    }

    public Map<Typ, Integer> getLicznikPojazdow() {
        return licznikPojazdow;
    }

    public void wyswietl() {

        System.out.println("Zarobiona kasa: " + zarobek);
        System.out.println("Koszt: " + koszt);
        for (Typ typ : licznikPojazdow.keySet()) { // przy pomocy entry setu lepiej
            System.out.println("Pojazdow o typie " + typ.name()
                    + " jest: " + licznikPojazdow.get(typ));
        }


    }
}
