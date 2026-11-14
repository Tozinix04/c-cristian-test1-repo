import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu ora (0–23) : ");
        int ora = scanner.nextInt();
        System.out.println("--------------------");

        if (ora < 0 || ora > 23) {
            System.out.println("Asa ora nu exista");
        } else if (ora < 6) {
            System.out.println("Noapte");
        } else if (ora < 12) {
            System.out.println("Dimineata");
        } else if (ora < 18) {
            System.out.println("Dupa amiaza");
        } else {
            System.out.println("Seara");
        }
    }
}
