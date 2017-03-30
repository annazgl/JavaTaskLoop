import java.util.Scanner;

public class Zad7 {

    // Napisz program, który odczytuje liczbę i sprawdza ile dana liczba ma dzielników.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = sc.nextInt();
        int counter = 0;

        for(int i =1; i<=number; i++) {
            if (number % i == 0)
                counter++;
        }
            System.out.println("Liczba dzielników liczby " + number + " to " + counter);
    }
}
