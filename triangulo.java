/*
 * 14. Un triángulo es equilátero si todos sus lados son iguales; isósceles, si solo tiene
    dos lados iguales, y en caso contrario, escaleno. Escriba un algoritmo que dado
    las longitudes de los lados de un triángulo determine si es equilátero, isósceles o
    escaleno.   
 */

import java.util.Scanner;

public class triangulo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las longitudes de los lados del triángulo
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Determinar el tipo de triángulo
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Las longitudes deben ser mayores que cero.");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        scanner.close();
    }
}
