import java.util.Scanner;

public class Zad4 {

    /* Napisz program, który sprawdza czy dany odczytany napis jest w poprawnym formacie kodu pocztowego tzn: 87-630
    jest w formacie poprawnym, natomiast 8aa-999 jest niepoprawnym kodem pocztowym ( dwie pierwsze cyfry następnie
     myślnik, następnie trzy cyfry)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        int correctLengthCode = 6;

        if (code.length() != correctLengthCode) {
            System.out.println("Kod jest niepoprawny");
        } else {
            boolean correctCode = true;
            for (int i = 0; i < 6; i++) {
                if (code.charAt(i) >= '0' && code.charAt(i) <= '9' && i!=2) {
                    continue;
                } else {
                    if (i == 2 && code.charAt(i) == '-') {

                        continue;
                    } else {
                        correctCode = false;
                        break;
                    }
                }
            }
            if (correctCode) {
                System.out.println("Kod jest poprawny");
            } else {
                System.out.println("Kod jest niepoprawny");
            }

        }
    }
}