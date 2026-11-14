import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primul numar : ");
        int a = scanner.nextInt();
        System.out.println("--------------------");

        System.out.print("Al doilea numar : ");
        int b = scanner.nextInt();
        System.out.println("--------------------");

        System.out.println("Produsul : " + (a * b));
    }
}
