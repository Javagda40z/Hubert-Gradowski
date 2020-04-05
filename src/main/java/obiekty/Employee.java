package obiekty;

public class Employee extends Person {

    private int rokUrodzenia;
    private String name;
    private int salary = 1000;

    public Employee(String name, int rokUrodzenia) {

        setName(name);

        if (rokUrodzenia > 2020 || rokUrodzenia < 1900){
            this.rokUrodzenia = 0;
        }else {
            this.rokUrodzenia = rokUrodzenia;
        }
    }

    public void whoAmI(){
        System.out.printf("Nazywam się %s i zarabiaM %d zł \n",name,salary);
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getSalary() {
        return salary;
    }
}
