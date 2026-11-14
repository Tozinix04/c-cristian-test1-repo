import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu luna (1-12) : ");
        int luna = scanner.nextInt();
        System.out.println("--------------------");

        switch (luna) {
            case 12:
            case 1:
            case 2:
                System.out.println("Iarna");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavara");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Vara");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Toamna");
                break;
            default:
                System.out.println("Asa luna nu exista, si nici anotimp!");
        }
    }
}
