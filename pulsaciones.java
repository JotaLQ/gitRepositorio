// 8. Calcular el numero de pulsaciones que una persona debe tener por cada 10
// segundos de ejercicio, si la fórmula es: número de pulsaciones : (220 - edad) /10 


import java.util.Scanner;

public class pulsaciones {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Calcular el número de pulsaciones
        int pulsaciones = (220 - edad) / 10;

        // Mostrar el resultado
        System.out.println("Número de pulsaciones por cada 10 segundos de ejercicio: " + pulsaciones);
        
        scanner.close();
    }
}
