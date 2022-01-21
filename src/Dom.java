public class Dom implements Budynek {

    private String adres;
    private KolorEnum kolorDomu;
    private int liczbaMieszkancow;
    private int iloscOkien;
    private double powierzchnia;

    public Dom() {
    }



    @Override
    public double powierzchnia(double pow) {
        this.powierzchnia = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int value) {
        this.iloscOkien = value;
        return value;
    }

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }



    public double getPowierzchnia() {
        return powierzchnia;
    }

    @Override
    public void liczbaMieszkancow(int value) {

        this.liczbaMieszkancow = value;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolorDomu = kolor;
    }

    @Override
    public void metrazNaMieszkanca(int mieszkancy, double powierzchnia) {
        System.out.println(mieszkancy/powierzchnia);
    }

    public void zmienKolorNaCzerwony(){
        this.kolorDomu = KolorEnum.CZERWONY;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "adres='" + adres + '\'' +
                ", kolorDomu=" + kolorDomu +
                ", liczbaMieszkancow=" + liczbaMieszkancow +
                ", iloscOkien=" + iloscOkien +
                ", powierzchnia=" + powierzchnia +
                '}';
    }
}
