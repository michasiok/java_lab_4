public class Pracownik implements PracownikI{
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int pensja;
    private int stazPracy;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, String stanowisko, int pensja, int stazPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
        this.stazPracy = stazPracy;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    @Override
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getPensja() {
        return pensja;
    }

    @Override
    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    @Override
    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                ", stazPracy=" + stazPracy +
                '}';
    }
}
