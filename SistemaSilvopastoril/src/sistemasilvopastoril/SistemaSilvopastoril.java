/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasilvopastoril;
import java.util.Scanner;

public class SistemaSilvopastoril {

    public static boolean areaValida(double area) {
        return 2 <= area && area <= 20;
    }

    public static double areaConservacion(double area) {
        return area * 0.5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Ingrese el área disponible en hectareas: ");
                double area = Double.parseDouble(scanner.nextLine());

                if (!areaValida(area)) {
                    System.out.println("No se puede implementar un sistema con el area ingresada");
                    break;
                }

                System.out.println("Seleccione el proposito del sistema:\n" +
                                   "- Ganaderia\n" +
                                   "- Agricola");
                String proposito = scanner.nextLine().toLowerCase();

                System.out.println("Seleccione el tipo de plantación (Escriba la opción):\n" +
                                   "- Espiral\n" +
                                   "- En filas\n" +
                                   "- Aleatoria");
                String plantacion = scanner.nextLine().toLowerCase();

                double metrosCuadrados = area * 10000 - areaConservacion(area);
                // Llamar al método Sistema y obtener los resultados
                // Nota: En Java, puedes imprimir directamente sin necesidad de almacenar en variables
                imprimirResultados(area, proposito, plantacion, metrosCuadrados);

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número, intentelo de nuevo");
            }
            
            // Preguntar si se quiere calcular otro sistema
            System.out.println("\nDesea calcular la implementacion de otro sistema?\n" +
                               "- Si\n" +
                               "- No");
            String opcion = scanner.nextLine().toLowerCase();

            if (opcion.equals("no")) {
                System.out.println("OK, Cerrando el programa...\nFin del programa");
                break;
            }
        }
    }

    public static void imprimirResultados(double area, String proposito, String plantacion, double metrosCuadrados) {
        double arboles = 0, arbustos = 0, animales = 0;

        // Ganadería
        if (proposito.equals("ganaderia")) {
            if (plantacion.equals("espiral")) {
                arboles = metrosCuadrados / 0.6;
                arbustos = metrosCuadrados / 1.1;
                animales = metrosCuadrados / 1.1;
            } else if (plantacion.equals("en filas")) {
                arboles = metrosCuadrados / 0.5;
                arbustos = metrosCuadrados / 1.2;
                animales = metrosCuadrados / 1;
            } else if (plantacion.equals("aleatoria")) {
                arboles = metrosCuadrados / 0.4;
                arbustos = metrosCuadrados / 1;
                animales = metrosCuadrados / 0.8;
            } else {
                System.out.println("Sin resultados debido a que no se conoce el tipo de plantacion a utilizar");
                return;
            }
        }
        // Agrícola
        else if (proposito.equals("agricola")) {
            if (plantacion.equals("espiral")) {
                arboles = metrosCuadrados / 0.8;
                arbustos = metrosCuadrados / 1.4;
            } else if (plantacion.equals("en filas")) {
                arboles = metrosCuadrados / 0.7;
                arbustos = metrosCuadrados / 1.3;
            } else if (plantacion.equals("aleatoria")) {
                arboles = metrosCuadrados / 0.5;
                arbustos = metrosCuadrados / 1.2;
            } else {
                System.out.println("Sin resultados debido a que no se conoce el tipo de plantacion a utilizar");
                return;
            }
        }
        // Sin propósito
        else {
            System.out.println("Proposito no valido");
            return;
        }

        // Impresión de resultados
        System.out.println("\nRESULTADOS:\n");
        System.out.printf("Se deben destinar %.2f hectáreas a conservacion%n", areaConservacion(area));
        System.out.printf("En el area a trabajar caben aproximadamente %.2f arboles%n", arboles);
        System.out.printf("En el area a trabajar caben aproximadamente %.2f arbustos%n", arbustos);

        // Verificar si el propósito es ganadería antes de imprimir la cantidad de animales
        if (proposito.equals("ganaderia")) {
            System.out.printf("En el area a trabajar se pueden sostener aproximadamente %.2f animales%n", animales);
        }
    }
}
