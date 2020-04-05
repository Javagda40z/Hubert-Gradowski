package zadania;

import java.util.Arrays;

public class ZadanieSzesc {

    public static void main(String[] args) {

        int[] tablica = new int[]{-2,23,3,5,-17,8,9,0,-5};

        ujemneWTablicy(tablica);
    }

    public static void ujemneWTablicy(int[] tablica){

        int licznik = 0;

        for (int i : tablica) {
            if (i < 0){
                licznik ++;
            }
        }

        int[] tablicaUjemna = new int[licznik];
        licznik = 0;

        for (int i : tablica) {
            if (i < 0){
                tablicaUjemna[licznik]= i;
                licznik ++;
            }
        }

        System.out.println("Liczba ujemnych: " + licznik);
        System.out.println(Arrays.toString(tablicaUjemna));

    }
}
