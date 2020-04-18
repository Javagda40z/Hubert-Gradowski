package hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KlasaTestowa {

    public static void main(String[] args) {

//        String zmienna = "tekst";
//        String zmienna2 = new String("tekst");
//        String zmienna3 = "tekst";
//
//
//        System.out.println(zmienna == zmienna2);
//        System.out.println(zmienna == zmienna3);
//        System.out.println(zmienna.equals(zmienna2));

        //

        Czlowiek czlowiek1 = new Czlowiek("Mateusz",99);
        Czlowiek czlowiek2 = new Czlowiek("Mateusz",99);
        Czlowiek czlowiek3 = new Czlowiek("X",99);

//        System.out.println(czlowiek1 == czlowiek2);
//        System.out.println(czlowiek1 == czlowiek3);
//        System.out.println(czlowiek1.equals(czlowiek2));

        Czlowiek czlowiek4 = new SuperCzlowiek("SuperMateusz",100);
        Czlowiek czlowiek5 = new ExtraCzlowiek("SuperMateusz",100);
        Czlowiek czlowiek6 = new Czlowiek("SuperMateusz",100);


        System.out.println(czlowiek4.equals(czlowiek5));


        List<Czlowiek> listaCzlowiekow = new ArrayList<>();
        listaCzlowiekow.add(czlowiek4);
        listaCzlowiekow.add(czlowiek5);
        listaCzlowiekow.add(czlowiek6);

        test(listaCzlowiekow);


        Map<String, Czlowiek> mapa = new HashMap<>();
        mapa.put("Mateusz", czlowiek4);
        mapa.put("X", czlowiek3);
        mapa.put("Mateusz", czlowiek3);

        System.out.println("Mateusz".hashCode());
    }

    public static void test(List<Czlowiek> czlowieki){

        Czlowiek czlowiek = czlowieki.get(0);
        Czlowiek czlowiek1 = czlowieki.get(1);
        czlowiek.equals(czlowiek1);


    }


}
