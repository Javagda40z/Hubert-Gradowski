package zadaniaDomowe;

abstract class Figura {

    private double polePowierzchni;

    private String kolor;

    public double getPolePowierzchni() {
        return polePowierzchni;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public abstract double liczPolePowierzchni();

}
