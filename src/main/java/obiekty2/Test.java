package obiekty2;

public class Test {

    public static void main(String[] args) {

        Animal2 kot = new Cat2("Mruczek");
        Animal2 pies = new Dog2("Burek");

        Vet2 vet2 = new Vet2();

        vet2.sayHello(kot);
        vet2.sayHello(pies);

        Animal2 chomik = new Hamster("Rudy");
        vet2.sayHello(chomik);
    }
}
