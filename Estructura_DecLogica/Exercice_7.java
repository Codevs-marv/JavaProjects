package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B;

        System.out.println("Digite el valor de A:");
        A = scanner.nextDouble();
        System.out.println("Digite el valor de B:");
        B = scanner.nextDouble();

        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");

        }
        scanner.close();
    }
}
