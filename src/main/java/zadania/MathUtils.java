package zadania;

public class MathUtils {

    public static boolean czyPodzielnaPrzez2(int a) {
        return a % 2 == 0;
    }

    public static boolean czyPierwsza(int liczba) {

        for ( int i = 2; i< liczba; i++){

            if (liczba % i == 0){
                return false;
            }
        }
        return  true;
    }
}
