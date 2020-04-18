package hashcode;

public class ExtraCzlowiek extends Czlowiek{

    int cos;

    public ExtraCzlowiek(String imie, int wiek) {
        super(imie, wiek);
    }

    public int getCos() {
        return cos;
    }

    public void setCos(int cos) {
        this.cos = cos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ExtraCzlowiek that = (ExtraCzlowiek) o;

        return cos == that.cos;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cos;
        return result;
    }
}

