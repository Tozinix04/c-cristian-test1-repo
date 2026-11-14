import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu varsta :  ");
        int varsta = scanner.nextInt();
        System.out.println("--------------------");

        if (varsta < 1 || varsta > 135) {
            System.out.println("Inca nu teai nascut sau deja ai murit.");
        } else if (varsta < 12) {
            System.out.println("Copil");
        } else if (varsta < 18) {
            System.out.println("Adolescent");
        } else {
            System.out.println("Adult");
        }
    }
}
