package zadaniaDomowe;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablice2 {

    public static void main(String[] args) {

        //1.Utwórz tablicę liczb 6,3,5,7,1,1,7,9
        int[] tablica = new int[]{6, 3, 5, 7, 1, 1, 7, 9};

        // 2.Policz średnią liczb z tablicy i wypisz na ekran
        liczSredniaLiczb(tablica);

        // 3.Znajdź największy i najmniejszy element w tablicy oraz wypisz je na ekran
        znajdzMaksimum(tablica);
        znajdzMinimum(tablica);

        // 4.Utwórz drugą tablicę 1,2,3,4,5,6,7,8 i:
        int[] tablica2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        // 5.Dodaj do siebie elementy pierwszej i drugiej tablicy
        sumujTablice(tablica,tablica2);

        // 6.Pomnózelementy pierwszej i drugiej tablicy
        //???

        // 7.Utwórz tablicęStringowzimionami :mateusz,kasia,adam,tomek,andrzej
        String[] tablicaImion = new String[]{"mateusz","kasia","adam","tomek","andrzej"};

        //          1.Wypisz tablicę oraz jej rozmiar.
        wypiszTablice(tablicaImion);

        //          2.Zamień pierwsze imię znajdujące się w tablicy napiotri wypisz tablicę
        tablicaImion[0] = "piotr";
        wypiszTablice(tablicaImion);

        //          3.Wypisz tablicę tak aby imiona zaczynały się od dużej litery
        wypiszTabliceZWielkiej(tablicaImion);

        //          4.Usuń z tablicy “adam” i sprawdź rozmiar tablicy. Czy wiesz dlaczego otrzymałeś taki wynik?
        //???

        //8.Stwórz metodę przyjmującą dwie tablice takich samych długości zwracającą trzecią tablicę
        // zawierającą elementy pierwszej i drugiej tablicy
        System.out.println(Arrays.toString(scalTablice(tablica,tablica2)));

        // 9.*Stwórz metodę przyjmującą dwie tablice takich samych długości zwracającą trzecią tablicę
        // zawierającą elementy pierwszej i drugiej tablicy bez powtórzeń. Spróbuj nie korzystać
        // z dodatkowych bibliotek.
        System.out.println(Arrays.toString(scalTabliceBezDubli(tablica, tablica2)));


        // 10.*Napisz funkcję zwracającą tablicę z elementami w odwrotnej kolejności i wypisz ją.
        // Przykład [1,2,3] -> [3,2,1].

        System.out.println(Arrays.toString(odwrocTablice(tablica)));


    }

    public static void liczSredniaLiczb(int[] tablica) {
        int suma = sumaLiczbWTablicy(tablica);
        double srednia = (double) suma / tablica.length;

        System.out.println("Średnia z liczb wynosi: " + srednia);
    }

    public static void znajdzMinimum(int[] tablica){
        int minimum = tablica[0];

        for (int liczba : tablica) {
            if (liczba<minimum) {
                minimum = liczba;
            }
        }
        System.out.println("Minimalna wartość w tablicy: " + minimum);
    }

    public static void znajdzMaksimum(int[] tablica){
        int maksimum = tablica[0];

        for (int liczba : tablica) {
            if (liczba>maksimum) {
                maksimum = liczba;
            }
        }
        System.out.println("Maksymalna wartość w tablicy: " + maksimum);
    }

    public static int sumaLiczbWTablicy(int[] tablica){
        int suma = 0;
        for (int liczba : tablica) {
            suma = suma + liczba;
        }
        return suma;
    }

    public static void sumujTablice(int[]...args){
        int wynik = 0;

        for(int i=0; i<args.length; i++) {

            wynik += sumaLiczbWTablicy(args[i]);
        }
        System.out.println("Suma liczb w tablicach: " + wynik);
    }

    public static void  wypiszTablice(String[] tablica){
        for (String element : tablica) {
            System.out.println(element);
        }
        System.out.println("Rozmiar tablicy: " + tablica.length);
    }

    public static void  wypiszTabliceZWielkiej(String[] tablica){
        for (String element : tablica) {
            String pierwsza = "" + element.charAt(0);
            element = element.replaceFirst("^[a-z]", pierwsza.toUpperCase());
            System.out.println(element);
        }
    }

//    Spróbować jutro usówanie elementu z tablicy
//    public static String[] usunImieZTablicy(String[] tablica, String imie){
//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i].equals(imie)){
//                tablica = new
//            }
//
//        }
//    }

    public static int[] scalTablice(int[] tablica1, int[] tablica2){
        int dlugosc = tablica1.length+tablica2.length;
        int[] nowaTablica = new int[dlugosc];
        for (int i = 0; i < tablica1.length; i++) {
            nowaTablica[i] = tablica1[i];
        }
        for (int i = 0; i < tablica1.length; i++) {
            nowaTablica[i+tablica1.length] = tablica2[i];
        }

//        System.out.println(Arrays.toString(nowaTablica));
        return nowaTablica;
    }

    public static int[] scalTabliceBezDubli(int[] tablica1, int[] tablica2){
        int[] tablica = scalTablice(tablica1,tablica2);
        List<Integer> lista = new ArrayList<>();

        for (int element : tablica) {
            if (!lista.contains(element)){
                lista.add(element);
            }
        }
        int[] tablicaBezDubli = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++){
            tablicaBezDubli[i] = lista.get(i);
        }

        return tablicaBezDubli;
    }

    public static int[] odwrocTablice(int[] tablica){

        int[] odwroconaTablica = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++){
            odwroconaTablica[i] = tablica[tablica.length-i-1];
        }
        return odwroconaTablica;
    }
}