public class Student implements StudentI{
    private String imie;
    private String nazwisko;
    private String wydzial;
    private int indeks;
    private int semestr;

    public Student() {
    }

    public Student(String imie, String nazwisko, String wydzial, int indeks, int semestr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wydzial = wydzial;
        this.indeks = indeks;
        this.semestr = semestr;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getWydzial() {
        return wydzial;
    }

    public void setWydzial(String wydzial) {
        this.wydzial = wydzial;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getSemestr() {
        return semestr;
    }

    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wydzial='" + wydzial + '\'' +
                ", indeks=" + indeks +
                ", semestr=" + semestr +
                '}';
    }
}
