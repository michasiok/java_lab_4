public interface Budynek {
    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    void metrazNaMieszkanca(int mieszkancy, double powierzchnia);

}
