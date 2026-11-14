import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {

        int[] numere = {3, -18, 10, 33, 5};
        int minim = numere[0];

        System.out.println("\nLista :");
        System.out.println(Arrays.toString(numere));

        for (int i = 1; i < numere.length; i++) {
            if (numere[i] < minim) {
                minim = numere[i];
            }
        }

        System.out.println("--------------------");
        System.out.println("Cel mai mic numar : " + minim);
    }
}
