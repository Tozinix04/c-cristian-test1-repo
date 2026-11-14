public class Ex13 {
    public static void main(String[] args) {

        System.out.println("De la 1 la 20, dar se opreste la 14 : \n");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);

            if (i == 14) {
                break;
            }
        }
    }
}
