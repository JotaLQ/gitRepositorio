/*
 * 16. Determinar el estado de una persona según su edad.
    Si tiene entre
    1 – 3 es bebé
    4 – 11 es niño
    12 – 17 es adolescente
    18 – 31 es joven
    32 – 65 es adulto
    > 65 es adulto mayor 
 */

import java.util.Scanner;

public class edad {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        
        String estado;

        if (edad >= 1 && edad <= 3) {
            estado = "bebé";
        } else if (edad >= 4 && edad <= 11) {
            estado = "niño";
        } else if (edad >= 12 && edad <= 17) {
            estado = "adolescente";
        } else if (edad >= 18 && edad <= 31) {
            estado = "joven";
        } else if (edad >= 32 && edad <= 65) {
            estado = "adulto";
        } else if (edad > 65) {
            estado = "adulto mayor";
        } else {
            estado = "edad no válida";
        }

        System.out.println("El estado de la persona es: " + estado);
        
        scanner.close();
    }
}
