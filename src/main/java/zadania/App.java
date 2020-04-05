package zadania;

public class App {

    public static void main(String[] args) {

//        App program = new App();
//        program.tabliczkaMnozenia(5);

        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
        System.out.println(tabliczkaMnozenia.getLiczba());
        tabliczkaMnozenia.wypiszTabliczke();

        System.out.println(silnia(4));
        System.out.println(sumaLiczb(1, 10));
    }

    public static int sumaLiczb(int x, int y){
        int suma = 0;
        for (int i = x; i <= y; i++){
            suma = suma +i;
        }
        return suma;
    }

    public static int silnia (int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * silnia(a-1);
    }

//    public void tabliczkaMnozenia(int liczba) {
//
//        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);
//
//        for ( int i = 1; i <= liczba; i++) {
//            System.out.println(liczba + " x " + i + " = " + liczba * i);
//        }
//    }

    // Tabliczka mnożenia dla liczby 5:
    // 5 x 1 = 5
    // 5 x 2 = 10
    // 5 x 3 = 15
    // 5 x 4 = 20
    // 5 x 5 = 25

}
