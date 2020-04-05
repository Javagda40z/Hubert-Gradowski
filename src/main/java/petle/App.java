package petle;

public class App {

    public static void main(String[] args) {

//        int i = 0;
//
//        while (i<=100){
//            System.out.println(i);
//            i++;
//        }
//
//        i = 100;
//        while (i>=0){
//            System.out.println(i);
//            i--;
//        }

//        for (int j = 300; j<=1000; j++){
//            if (j % 2 == 0 && j % 3 == 0){
//                System.out.println(j);
//            }
//        }

        String napis = "Jestem na dobrej drodze do zostania profesjonalnym programistą Java";

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i + napis);
//        }

//        for (int i = 0; i < napis.length(); i++){
//            if (i%2 == 0){
//                System.out.print(napis.charAt(i));
//            }
//        }

//        for (int i = napis.length() - 1; i >= 0; i--) {
//            System.out.print(napis.charAt(i));
//        }
        zadanieTrzecie(1,2,10);
    }

    public static void zadanieTrzecie(int a, int b, int c) {
        int counter = 0;

        do {
          counter = counter+a+b;
        }while (counter < c);

        System.out.println(counter);

    }

}


