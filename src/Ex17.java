import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {


        int[] numere = {7, -3, 25, 11, 4};
        int maxim = numere[0];

        System.out.println("\nLista :");
        System.out.println(Arrays.toString(numere));

        for (int i = 1; i < numere.length; i++) {
            if (numere[i] > maxim) {
                maxim = numere[i];
            }
        }
        System.out.println("--------------------");
        System.out.println("Cea mai mare valoare : " + maxim);
    }
}
