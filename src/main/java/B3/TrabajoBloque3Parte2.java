package B3;

public class TrabajoBloque3Parte2 {
    public static void main(String[] args) {

        for (int num1 = 2; num1 <= 1000; num1++) {
            boolean esNumeroPrimo = true;

            for (int i = 2; i < num1; i++) {

                if (num1 % i == 0 ) {
                    esNumeroPrimo = false;
                    break;
                }
            }
            if (esNumeroPrimo) {
                System.out.print(num1 + " ");
            }
        }
    }
}