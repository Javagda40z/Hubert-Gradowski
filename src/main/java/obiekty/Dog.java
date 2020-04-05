package obiekty;

public class Dog implements Animal {

    private String name;

    public Dog(){
        setName("Pies");
    }
    public Dog(String name){
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

    public void aportuj(){
        // pies aportuje
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
