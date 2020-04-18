package bramka;

import pojazdy.Paliwo;
import pojazdy.Pojazd;
import util.KalkulatorUtil;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static pojazdy.Paliwo.PRAD;

public class KalkulatorOplat {

    public static int OPLATA = 2;

    public int policz(Wjazd wjazd){
        LocalDateTime dataWjazdu = wjazd.getDataWjazdu();
        LocalDateTime dataWyjazdu = LocalDateTime.now();
        Pojazd pojazd = wjazd.getPojazd();

        long czasNaParkingu = ChronoUnit.HOURS.between(dataWjazdu,dataWyjazdu);
//        Duration between = Duration.between(dataWjazdu,dataWyjazdu);

        //tylko na czas testu
        czasNaParkingu = czasNaParkingu + KalkulatorUtil.randomHourBetween(1,24);
        //

        double mnoznik = policzMnoznik(pojazd);

        if (czasNaParkingu < 1 || PRAD.equals(pojazd.getPaliwo())){
            return 0;
        }

        return (int) (czasNaParkingu * OPLATA * mnoznik);
    }

    private double policzMnoznik(Pojazd pojazd) {

        double mnoznik = 1;

        switch(pojazd.getTyp()) {
            case OSOBOWY:
                mnoznik = mnoznik * 1;
                break;
            case MOTOCYKL:
                mnoznik = mnoznik * 0.5;
                break;
            case CIEZAROWY:
                mnoznik = mnoznik * 2;
                break;
            default:
                break;
        }

        return mnoznik;
    }

}
