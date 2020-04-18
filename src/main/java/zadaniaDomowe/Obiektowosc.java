package zadaniaDomowe;

public class Obiektowosc {

    public static void main(String[] args) {

//        1.Stwórz klasę Punkt. Klasa powinna zawierać pola wskazujące na współrzędne punktu.
        Punkt punkt1 = new Punkt(1,0);
        Punkt punkt2 = new Punkt(2,3);



//        2.Klasa powinna mieć konstruktor pozwalający na prawidłowe stworzeniepounktu
//              >1.Stwórz klasę reprezentującą odcinek na płaszczyźnie. Odcinek składa się
//                 z dwóch oddalonych od siebie punktów -uwzględnij to przy projektowaniu klasy Odcinek.
        Odcinek odcinek = new Odcinek(punkt1,punkt2);

//              >2.Stwórz metodę obliczającą długość odcinka na podstawie podanychpunktów
        System.out.println("Długość odcinka wynosi: " + odcinek.dlugoscOdcinka());

//              >3.Dodajmetodęktóra rysuje odcinek. Odcinek długości 4 powinien wyglądaćtak :|----|
        odcinek.rysujOdcinek();

//        3.Reprezentacja figur geometrycznych na płaszczyźnie
//              >1.Stwórz klasę Koło. Podczas tworzenia obiektu tej klasy użytkownik powinien móc podać
//                 promień tworzonego koła i kolor figury. Użytkownik musi mieć także możliwość obliczenia
//                 pola figury.


//              >2.Stwórz analogicznie klasy innych figurgeometrycznych(prostokąt, kwadrat, trójkąt)
//              >3.Utwórz instancje wszystkich stworzonych figur oraz stwórz listę do których dodasz utworzone figury.
//                 Czywieszdlaczego to nie zadziała?
//              >4.Czy widzisz cechy wspólne tych figur? Spróbuj je wyodrębnić i utwórz abstrakcyjny typ posiadający
//                 te cechy.
//              >5.Spróbuj ponownie utworzyć listę figur a następnie wypisz ich pola.
    }
}
