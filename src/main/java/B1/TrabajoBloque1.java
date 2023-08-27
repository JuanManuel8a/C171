package B1;

import java.util.Scanner;

public class TrabajoBloque1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1>num3) {
            System.out.println("El número mayor es "+num1);
        } else if (num2 > num1 && num2>num3) {
            System.out.println("El número mayor es "+num2);
        } else if (num3 > num1 && num3>num2) {
            System.out.println("El número mayor es "+num3);
        } else {
            System.out.println("Los números son iguales");
        }
        scanner.close();
    }
}
