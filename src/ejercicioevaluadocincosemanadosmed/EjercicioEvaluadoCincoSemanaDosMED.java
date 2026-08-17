/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioevaluadocincosemanadosmed;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class EjercicioEvaluadoCincoSemanaDosMED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Error: El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " (" + numero + "!) es: " + factorial);
        }
        scanner.close();
    }
}
