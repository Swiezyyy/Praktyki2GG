package Praktyki.Klasy_abs;

public class Kwadrat implements Obliczenia{
    private int bokA;

    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    @Override
    public int obliczPole() {
        return bokA*bokA;
    }

    @Override
    public int obliczObw() {
        return 4*bokA;
    }
}
