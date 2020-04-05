package zadania;

import org.apache.commons.lang3.math.NumberUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

//        int[] tablica = new int[]{1,2,3};
//
//        System.out.println(Arrays.toString(tablica));
//        zamienPierwszyITrzeciElement(tablica);
//        System.out.println(Arrays.toString(tablica));
//
        int[] nieposortowanaTablica = new int[]{1,3,3,4,3,2,1};

//        System.out.println(Arrays.toString(nieposortowanaTablica));
//        Arrays.sort(nieposortowanaTablica);
//        System.out.println(Arrays.toString(nieposortowanaTablica));

//        minimalnaIMaksymalna(nieposortowanaTablica);

//        System.out.println(NumberUtils.max(nieposortowanaTablica));
//        System.out.println(Arrays.toString(nieposortowanaTablica));

    }

    public static void zamienPierwszyITrzeciElement(int[] tablica){

        int zmienna = tablica[0];

        tablica [0] = tablica[2];

        tablica[2] = zmienna;

    }

    public static void minimalnaIMaksymalna(int[] tablica){

        Arrays.sort(tablica);
        int minimum = tablica[0];
        int maksimum = tablica[tablica.length-1];
        System.out.println("Minimalna wartość w tablicy: " + minimum);
        System.out.println("Maksymalna wartość w tablicy: " + maksimum);
    }




}
