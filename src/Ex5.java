import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.print("Introduce parola  : ");
        String password = scanner.nextLine();

        System.out.println("--------------------");
        System.out.println("Parola este : " + password);
        System.out.println("--------------------");
    }
}
