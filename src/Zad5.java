import java.util.Scanner;


public class Zad5 {

    //Stwórz program, który sprawdza czy wprowadzone imię jest męskie czy żeńskie.

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    if(name.endsWith("a")){
        System.out.println("Kobieta");
    }else{
        System.out.println("Mężczyzna");
    }

    }
}
