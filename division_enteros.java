/*
 * 12. Leer dos numeros enteros positivos y obtener la division de los mismos.
       Verificar que el denominador no sea cero, en caso de serlo mostrar el error
 */

import java.util.Scanner;

public class division_enteros {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el primer número
        System.out.print("Introduce el numerador (entero positivo): ");
        int numerador = scanner.nextInt();

        // Leer el segundo número
        System.out.print("Introduce el denominador (entero positivo): ");
        int denominador = scanner.nextInt();

        // Verificar que el denominador no sea cero
        if (denominador == 0) {
            System.out.println("Error: El denominador no puede ser cero.");
        } else {
            // Realizar la división
            double resultado = (double) numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        }

        scanner.close();
    }
}
