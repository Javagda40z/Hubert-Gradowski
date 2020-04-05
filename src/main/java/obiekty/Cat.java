package obiekty;

import java.sql.SQLOutput;

public class Cat implements Animal {

    private int liczbaZjedzonychMyszy = 0;

    private String name;

    public Cat(){
        setName("Kot");
    }

    public Cat(String name){
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }
    
    public void drap(){
        //kot drapie
    }

    public void eatMouse(){

        liczbaZjedzonychMyszy++;

        System.out.println("Zjadłem " + liczbaZjedzonychMyszy + " myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("Miał.");
    }


    public int getLiczbaZjedzonychMyszy() {
        return liczbaZjedzonychMyszy;
    }

    @Override
    public void move() {
        System.out.println("Idę.");
    }
}
