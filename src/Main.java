public class Main {
    public static void main(String[] args) {
   /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwadrat = new Kwadrat(2);
        System.out.println(kwadrat.nazwaFigury("kwadrat"));
        kwadrat.pole();
        kwadrat.obwod();


        Prostokat prostokat = new Prostokat(2,4);
        System.out.println(kwadrat.nazwaFigury("prostokąt"));
        prostokat.pole();
        prostokat.obwod();
    }
}
