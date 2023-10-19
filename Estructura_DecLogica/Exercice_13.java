/*
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un
50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados.
 */



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
