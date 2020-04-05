package obiekty2;

import obiekty.Animal;

public class Dog2 extends Animal2 {

    public Dog2(String imie) {
        super(imie);
    }

    @Override
    public void makeSound() {

        System.out.println("Hał.");
    }

    @Override
    public void move() {
        System.out.println("Idę.");
    }
}
