/*
 * 18. Leer la edad y estatura de una persona y determinar si o no es APTO lo es Para
    jugar en la selección de mayores en basquet. Considerar los requisitos para ser
    jugador de basquet. Estatura minima 1.65 y edad mayor a 14 años. 
 */

import java.util.Scanner;

public class selec_basquet {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer edad
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // Leer estatura
        System.out.print("Ingrese la estatura de la persona en metros: ");
        double estatura = scanner.nextDouble();

        // Determinar si es apto y mostrar resultado
        if (edad > 14 && estatura >= 1.65) {
            System.out.println("La persona es APTO para jugar en la selección de mayores.");
        } else {
            System.out.println("La persona NO es APTO para jugar en la selección de mayores.");
        }

        scanner.close();
    }
}
