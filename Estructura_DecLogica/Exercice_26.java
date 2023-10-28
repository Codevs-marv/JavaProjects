/*  Hacer un algoritmo que determine la suma del valor menor y mayor en un grupo de 4 datos. */


package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese 4 números
        System.out.println("Ingresa 4 números:");

        double[] datos = new double[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            datos[i] = scanner.nextDouble();
        }

        // Encuentra el valor mínimo y el valor máximo
        double min = datos[0];
        double max = datos[0];
        
        for (int i = 1; i < 4; i++) {
            if (datos[i] < min) {
                min = datos[i];
            }
            if (datos[i] > max) {
                max = datos[i];
            }
        }

        // Calcula la suma del valor mínimo y el valor máximo
        double sumaMinMax = min + max;

        // Imprime los resultados
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El valor máximo es: " + max);
        System.out.println("La suma del valor mínimo y máximo es: " + sumaMinMax);

        scanner.close();
    }
}
