package obiekty;

public class Cow implements Animal {

    private String name;

    public Cow(){
        setName("Krowa");
    }
    public Cow(String name){
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

    public void dajMleko(){
        //krowa daje mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Muu.");
    }

    @Override
    public void move() {
        System.out.println("Idę.");
    }
}
