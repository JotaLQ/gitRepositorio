/*
 * 17. Leer la edad de una persona y determinar si es mayor o menor de edad. Validar
       la entrada de manera que no acepte valores negativos. 
 */

import java.util.Scanner;

public class validar_edad {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1; // Inicializamos con un valor negativo para controlar la validación

        // Bucle para asegurar que la entrada es válida
        while (edad < 0) {
            System.out.print("Ingrese su edad: ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                // Validar si la edad es negativa
                if (edad < 0) {
                    System.out.println("Por favor, ingrese una edad válida (no puede ser negativa).");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer
            }
        }

        // Determinar si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }
}
