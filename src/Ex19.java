import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------------------");
        System.out.print("Introdu R, G sau V la alegere : ");
        String litera = scanner.nextLine().trim().toUpperCase();
        System.out.println("--------------------");

        switch (litera) {
            case "R":
                System.out.println("Rosu");
                System.out.println("--------------------");
                break;
            case "G":
                System.out.println("Galben");
                System.out.println("--------------------");
                break;
            case "V":
                System.out.println("Verde");
                System.out.println("--------------------");
                break;
            default:
                System.out.println("AM ZIS R, G sau V, de unde ai luat " + litera + " ???");
                System.out.println("--------------------");
        }
    }
}
