import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {

        System.out.println("\nLista originala : ");
        byte[] numere = {5, 10, 15, 20, 25};

        System.out.println(Arrays.toString(numere));

        numere[4] = 99; //schimbam pozitia 4 cu alt numar din 20 -> 99

        System.out.println("\nLista schimbata : ");
        System.out.println(Arrays.toString(numere));
    }
}
