// 6. Leer dos números y presentar suma resta multiplicación y división

import java.util.Scanner;

public class calculadora {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer dos números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        // Realizar operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division;
        
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = Double.NaN; // Manejo de división por cero
        }
        
        // Presentar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }
        
        scanner.close();
    }
}
