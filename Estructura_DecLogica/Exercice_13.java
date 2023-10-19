package Estructura_DecLogica;
import java.util.Scanner;

public class Exercice_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valcomp, valpag, pdes;
        String color;

        System.out.println("Digite el valor de la compra: ");
        valcomp = scanner.nextDouble();
        System.out.println("¿Cuál es el color de su bolita? escriba en minusculas");
        color = scanner.nextLine();
        
        if (color == "blanco") {
            pdes = 0;
        } else if (color == "verde") {
            pdes = 10;
        } else if (color == "amarillo") {
            pdes = 25;
        } else if (color == "azul") {
            pdes = 50;
        } else {
            pdes = 100;
        }
        
        valpag = valcomp - ((pdes * valcomp) / 100);
        System.out.println("El cliente debe pagar $" + valpag);

        scanner.close();
    }
}
