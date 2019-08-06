import java.util.Scanner;

/*Napisz dwie klasy implementujące interfejs Computation. Niech jedna z implementacji
przeprowadza operację dodawania, druga mnożenia.
 */
public class Main {

     Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;



        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę

            }

        else {
            computation = new Addition(); // zaimplementuj brakującą klasę

            }


        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Napisz mnożenie jeśli chcesz wykonać mnożenie." +
                " Każdy inny wybór będzie oznaczał dodawanie ");
        boolean wynik ;
        if (sc.next().equals("mnożenie"))
        {
            return wynik = true;
        }
        else {
            return wynik = false;
        }
    }





    private double getArgument() {
        System.out.println("Podaj liczbe");
        return sc.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }

}
