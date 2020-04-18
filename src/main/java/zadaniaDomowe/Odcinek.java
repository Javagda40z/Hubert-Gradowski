package zadaniaDomowe;

public class Odcinek {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Odcinek(Punkt poczatek, Punkt koniec){
        setX1(poczatek.getX());
        setX2(koniec.getX());
        setY1(poczatek.getY());
        setY2(koniec.getY());
    }

    public double dlugoscOdcinka(){

        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
    }

    public void rysujOdcinek(){

        System.out.print("|");
        for (int i = 0; i < (int) dlugoscOdcinka(); i++) {
            System.out.print("-");
        }

        System.out.print("|\n");

    }

    private void setX1(int x1) {
        this.x1 = x1;
    }

    private void setX2(int x2) {
        this.x2 = x2;
    }

    private void setY1(int y1) {
        this.y1 = y1;
    }

    private void setY2(int y2) {
        this.y2 = y2;
    }
}
