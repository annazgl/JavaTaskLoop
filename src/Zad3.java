
public class Zad3 {

    //Napisz program, który sumuje wszystkie liczby od 1 do 100.

    public static void main(String[] args) {

        int a = 0;
        int suma=0;

        do {
            a++;
            suma = suma + a;
            System.out.println(a);
        } while (a <= 99);
        System.out.println(suma);
    }
}
