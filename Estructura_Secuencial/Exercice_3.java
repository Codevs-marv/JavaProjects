package Estructura_Secuencial;
import java.util.Scanner;

public class Exercice_3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1, l2, p, area;

        System.out.println("Digite el valor de l1: ");
        l1 = scanner.nextDouble();
        System.out.println("Digite el valor de l2");
        l2 = scanner.nextDouble();

        p = (2 * l1) + (2 * l2);
        area = l1 * l2;

        System.out.println("El perimetro es: " + p);
        System.out.println("El area es: " + area);

        scanner.close();
    }
}