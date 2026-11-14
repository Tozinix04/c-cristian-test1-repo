import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un text : ");
        String text = scanner.nextLine();
        System.out.println("--------------------");

        int lungime = text.length();
        System.out.println("Numarul de caractere : " + lungime);
        System.out.println("--------------------");

        if (lungime == 0) {
            System.out.println("Nu ai scris nimic...");
        } else {
            System.out.println("Indicele maxim : " + (lungime - 1));
        }
    }
}
