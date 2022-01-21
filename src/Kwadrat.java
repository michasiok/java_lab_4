public class Kwadrat extends Figura{
    int bokA;

    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }

    @Override
    void pole() {
        System.out.println("Pole: " + bokA * bokA);
    }

    @Override
    void obwod() {
        System.out.println("Obwód: " + 4*bokA);
    }
}
