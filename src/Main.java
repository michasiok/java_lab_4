import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów
        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */


        Student student1 = new Student("Adam", "Nowak", "FTIMS", 1231, 1);
        Student student2 = new Student("Bartek", "Kasztaniak", "ETI", 32151, 5);

        Pracownik pracownik1 = new Pracownik("Kacper", "Klon", "woźny", 1000000, 100);
        Pracownik pracownik2 = new Pracownik("Przemek", "Dąb", "dozorca", 10, 500);

        ArrayList<CzlowiekI> lista = new ArrayList<CzlowiekI>();
        lista.add(student1);
        lista.add(student2);
        lista.add(pracownik1);
        lista.add(pracownik2);

        for (CzlowiekI czlowiek: lista) {
            System.out.println(czlowiek.toString());
        }
    }
}
