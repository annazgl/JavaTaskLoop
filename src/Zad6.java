import java.util.Scanner;

public class Zad6 {

    // Stwórz program, który odczytuję dany napis i wypisuje ile razy w danym napisie występują małe litery.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj napis");
        String text = sc.nextLine();

        for (char i = 'a'; i < 'z'; i++) {
            int count = countChar(text, i);
            if (count > 0) {
                System.out.println(i + " " + count);
            }
        }
    }

    public static int countChar(String text, char character) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}
