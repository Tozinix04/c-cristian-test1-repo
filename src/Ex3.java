import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu doua numere intregi! ");

        System.out.print("Primul Numar : ");
        int a = scanner.nextInt();
        System.out.print("Al doilea numar : ");
        int b = scanner.nextInt();
        System.out.println("------------------------");
        System.out.println("Adunare : " + (a + b));
        System.out.println("Scadere : " + (a - b));
        System.out.println("Inmultire : " + (a * b));

        if (b == 0) {
            System.out.println("Impartirea si restul nu se pot calcula cu divizorul 0.");
        } else {
            System.out.println("Impartirea : " + ((double) a / b));
            System.out.println("Rest : " + (a % b));
            System.out.println("--------------------");
        }
    }
}
