import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un numar : ");
        int nr = scanner.nextInt();
        System.out.println("--------------------");

        if (nr % 2 == 0) {
            System.out.println("Numarul este par!");
        } else {
            System.out.println("Numarul este impar.");
        }
    }
}
