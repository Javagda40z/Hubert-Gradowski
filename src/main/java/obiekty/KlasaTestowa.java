package obiekty;

public class KlasaTestowa {

    public static void main(String[] args) {

        Animal[] zwierzeta = new Animal[3];

//        Cat kot = new Cat();
//        Dog pies = new Dog();
//        Cow krowa = new Cow();

//        zwierzeta[0] = kot;
//        zwierzeta[1] = pies;
//        zwierzeta[2] = krowa;

        //Na potrzeby zadania wystarczy w ten sposob:
        zwierzeta[0] = new Cat();
        zwierzeta[1] = new Dog();
        zwierzeta[2] = new Cow();

        for (Animal zwierze : zwierzeta) {

            zwierze.makeSound();

        }

    }

}
