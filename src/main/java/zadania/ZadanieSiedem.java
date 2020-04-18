package zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ZadanieSiedem {

    public static void main(String[] args) {

        System.out.println(stworzCiagArytmetyczny(1, 2, 5));
        List<Integer> ciag1 = stworzCiagArytmetyczny(1,1,10);
        List<Integer> ciag2 = Arrays.asList(1,2,3,44,4,5,6,7);

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

        System.out.println(czyCiagArytmetyczny(ciag1));
        System.out.println(czyCiagArytmetyczny(ciag2));
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

    public static boolean czyCiagArytmetyczny(List<Integer> ciag){

        for (int i = 1; (i + 1) < ciag.size(); i++) {
            if ((ciag.get(i-1) + ciag.get(i+1))/2 != ciag.get(i)){
                return false;
            }
        }
        System.out.println(ciag);
        return true;
    }
}
