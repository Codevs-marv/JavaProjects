/*
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio es mayor que $2.000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula
*/



package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroInscripcion;
        String nombre;
        double pagoMatricula = 50000;

        System.out.print("Ingrese el numero de inscripción: ");
        numeroInscripcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea restante

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el valor del patrimonio: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el numero de semestres cursados: ");
        int semestresCursados = scanner.nextInt();

        if (patrimonio > 2000000 && semestresCursados > 3) {
            pagoMatricula = pagoMatricula + 0.03 * patrimonio;
        }

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numeroInscripcion + " Y NOMBRE " + nombre + " DEBE PAGAR: $" + Math.round(pagoMatricula));

        scanner.close();
    }
}

