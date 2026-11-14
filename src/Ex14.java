public class Ex14 {
    public static void main(String[] args) {

        System.out.println("De la 1 la 20, dar la 14 fac o pauza (nu apare cifra 14)\n");

        for (int i = 1; i <= 20; i++) {
            if (i == 14) {
                continue;
            }
            System.out.println(i);
        }
    }
}
