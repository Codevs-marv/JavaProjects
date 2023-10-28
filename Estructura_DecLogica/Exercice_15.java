/* Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso. */




package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pesoA, pesoB, pesoC, pesoD;

        System.out.println("Ingrese el peso de la esfera A:");
        pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        pesoC = scanner.nextDouble();
        System.out.println("Ingrese el peso de la esfera D:");
        pesoD = scanner.nextDouble();

        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es al diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es al diferente y es de menor peso");
            }

        } else if (pesoA == pesoB && pesoA == pesoD) {
            if (pesoC > pesoA) {
                System.out.println("La esfera C es al diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es al diferente y es de menor peso");
            }

        } else if (pesoA == pesoC && pesoA == pesoD) {
            if (pesoB > pesoA) {
                System.out.println("La esfera B es al diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es al diferente y es de menor peso");
            }

        } else if (pesoA > pesoB) {
            System.out.println("La esfera A es al diferente y es de mayor peso");
        } else {
            System.out.println("La esfera A es al diferente y es de mayor peso");
        }

        scanner.close();
    }
}
