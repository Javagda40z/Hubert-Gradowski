package zadania;

public class PrimeNumberChecker {

    private int[] liczbyPierwsze;

    public PrimeNumberChecker(int[] liczbyPierwsze) {
        this.liczbyPierwsze = liczbyPierwsze;
    }

    public boolean czyPierwsza(int a) {

        for (int i : liczbyPierwsze) {
           if (i == a) {
               return true;
           }
        }
        return false;
    }

}
