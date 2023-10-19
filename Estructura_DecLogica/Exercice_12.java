/*
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.
 */


package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double NHT, VHN, HET, HEE8, SALARIO;
        String NOM;

        System.out.println("Digite el nombre del empleado: ");
        NOM = scanner.nextLine();
        System.out.println("Ingrese el N° de horas trabajadas: ");
        NHT = scanner.nextDouble();
        System.out.println("Digite el valor hora normal trabajada: ");
        VHN = scanner.nextDouble();

        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 *VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }

        System.out.println("El trabajador " + NOM + ", devengo: $" + SALARIO);
        
        scanner.close();
    }
}
