public class Main {
    public static void main(String[] args) {
 /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom dom1 = new Dom();

        dom1.adresBudynku("asdasdasd 255A/2 80-440");
        dom1.kolorDomu(KolorEnum.CZARNY);
        dom1.liczbaMieszkancow(10);
        dom1.liczbaOkien(3);
        dom1.powierzchnia(1000.23);
        dom1.metrazNaMieszkanca(dom1.getLiczbaMieszkancow(), dom1.getPowierzchnia());
        dom1.zmienKolorNaCzerwony();
        System.out.println(dom1.toString());




        Budynek dom2 = new Dom();

        dom2.adresBudynku("sdgsdggwegw 15B/2 11-220");
        dom2.kolorDomu(KolorEnum.CZERWONY);
        dom2.liczbaMieszkancow(66);
        dom2.liczbaOkien(100);
        dom2.powierzchnia(55.23);

        System.out.println(dom2.toString());
    }
}
