package Estructura_Secuencial;
import java.util.Scanner;

public class Exercice_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double edJuan, edAlb, edAna, edMama;

        System.out.println("Digite la edad de Juan:");
        edJuan = scanner.nextDouble();

        edAlb = 2* edJuan / 3;
        edAna = 4 * edJuan / 3;
        edMama = edJuan + edAlb + edAna;

        System.out.println("Las edades son: Alberto = " + Math.round(edAlb) + ", Juan = " + Math.round(edJuan) + ", Ana = " + Math.round(edAna) + ", mama = " + Math.round(edMama));
        
        scanner.close();
    }
}
