package obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaTestowa {

    public static void main(String[] args) {

        Animal[] zwierzeta = new Animal[3];
        List<Animal> listaZwierzat = new ArrayList<>();

        zwierzeta[0] = new Cat();
        zwierzeta[1] = new Dog();
        zwierzeta[2] = new Cow();

        listaZwierzat.add(new Cat());
        listaZwierzat.add(new Dog());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cow());

        dajGlos(zwierzeta);
        System.out.println();
        dajGlos(listaZwierzat);

    }

    public static void dajGlos(Animal[] zwierzeta){

        for (Animal zwierze : zwierzeta) {
            zwierze.makeSound();
        }
    }

    public static void dajGlos(List<Animal> zwierzeta){
        for (Animal zwierze : zwierzeta) {
            zwierze.makeSound();

        }
    }

}
