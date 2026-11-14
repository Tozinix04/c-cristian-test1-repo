import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Introdu primul numar : ");
        int a = scanner.nextInt();

        System.out.println("--------------------");
        System.out.print("Introdu al doilea numar : ");
        int b = scanner.nextInt();

        System.out.println("--------------------");
        if (a < b) {
            System.out.println(a + " este mai mic, iar " + b + " este mai mare");
        } else if (a > b) {
            System.out.println(b + " este mai mic, iar " + a + " este mai mare");
        } else {
            System.out.println("Numerele sunt egale!");
        }
    }
}
