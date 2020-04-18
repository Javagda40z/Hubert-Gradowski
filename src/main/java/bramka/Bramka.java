package bramka;

import pojazdy.Pojazd;

public class Bramka implements Szlaban{

    private RejestrPojazdow rejestrPojazdow;
    private KalkulatorOplat kalkulatorOplat;
    private final Raport raport;

    public Bramka(RejestrPojazdow rejestrPojazdow) {
        this.rejestrPojazdow = rejestrPojazdow;
        raport = new Raport();
    }

    @Override
    public void wjazd(Pojazd pojazd) {

        boolean czyWjechal = rejestrPojazdow.wpisz(pojazd);
        
        if(!czyWjechal){
            zawolajPomoc(pojazd);
        }else {
            raport.dodajPojazd(pojazd);
            System.out.println("Pojazdu o nr rejestracyjnym: "
                    + pojazd.getRejestracja() + " wjechal na parking.");
        }
    }

    private void zawolajPomoc(Pojazd pojazd) {

        System.out.println("Wolam pomoc dla pojazdu o nr rejestracyjnym: "
                + pojazd.getRejestracja());
    }

    @Override
    public void wyjazd(Pojazd pojzad, int zaplata) {

        Wjazd wjazd = rejestrPojazdow.wypisz(pojzad);

        int koszt = kalkulatorOplat.policz(wjazd);

        if (koszt>zaplata){
            zawolajPomoc(pojzad);
        }
        raport.dodajKase(zaplata);
        raport.dodajKoszt(koszt);

        System.out.println("Wyjeżdża pojazd o nr rejestracyjnym "
                + wjazd.getPojazd().getRejestracja() + " zaplacono: " + zaplata + " a koszt to " + koszt);

    }

    public void setKalkulatorOplat(KalkulatorOplat kalkulatorOplat) {
        this.kalkulatorOplat = kalkulatorOplat;
    }

    public Raport przygotujRaport(){
        return raport;
    }
}
