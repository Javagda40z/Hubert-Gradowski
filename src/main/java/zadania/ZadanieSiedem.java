package zadania;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZadanieSiedem {

    public static void main(String[] args) {

        System.out.println(stworzCiagArytmetyczny(1, 2, 5));


        //Omówienie polimorfizmu na zasadzie list
        List<String> listaPracownikow = new ArrayList<>();
        listaPracownikow.add("Mateusz1");
        listaPracownikow.add("Mateusz2");
        listaPracownikow.add("Marika");

        List<String> listaPracownikowZInnegoDzialu = new LinkedList<>();
        listaPracownikow.add("Mateusz");
        listaPracownikow.add("Mateusz3");
        listaPracownikow.add("Marika2");

        dajPodwyzke(listaPracownikow);
        dajPodwyzke(listaPracownikowZInnegoDzialu);
        //
    }
    //
    public static void dajPodwyzke(List<String> pracownicy){

        //daje podwyzke kazdemu pracownikowi

    }
    //

    public static List<Integer> stworzCiagArytmetyczny(int a, int inc, int len) {

        List<Integer> ciag = new ArrayList<>();

        int wyraz = 0;

        for (int i = 0; i < len; i++) {
            wyraz = a + (i * inc);
            ciag.add(wyraz);
        }
        return ciag;
    }
}
