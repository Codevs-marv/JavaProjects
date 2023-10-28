/* Una empresa con tres departamentos tiene establecido un plan de incentivos para sus vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento

Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período.*/


package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;

        System.out.println("Ingrese las ventas del Depto 1:");
        VD1 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del Depto 2:");
        VD2 = scanner.nextDouble();
        System.out.println("Ingrese las ventas del Depto 3:");
        VD3 = scanner.nextDouble();
        System.out.println("Ingrese el salario que reciben los vendedores en cada Depto:");
        SALAR = scanner.nextDouble();

        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;

        if (VD1 > PORVEN) {
            SALAR1 = SALAR + (0.2 * SALAR);
        } else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = SALAR + (0.2 * SALAR);
        } else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = SALAR + (0.2 * SALAR);
        } else {
            SALAR3 = SALAR;
        }

        System.out.println("Salario vendedores Depto 1:  $" + SALAR1);
        System.out.println("Salario vendedores Depto 2:  $" + SALAR2);
        System.out.println("Salario vendedores Depto 3:  $" + SALAR3);

        scanner.close();
    }
}
