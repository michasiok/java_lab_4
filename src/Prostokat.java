public class Prostokat extends Figura{
    int bokA;
    int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    void pole() {
        System.out.println("Pole: " + bokA * bokB);
    }

    @Override
    void obwod() {
        System.out.println("Obwód: " + (2*bokA + 2*bokB));
    }
}
