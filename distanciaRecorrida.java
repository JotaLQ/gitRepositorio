// 2. Se desea calcular la distancia recorrida por un sujeto que tiene una velocidad
// constante durante un tiempo. Necesita la fórmula de Movimiento rectilíneo
// uniforme.

import java.util.Scanner;

public class distanciaRecorrida {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        // Solicitar velocidad
        System.out.print("Ingrese la velocidad (en m/s): ");
        double velocidad = teclado.nextDouble();

        // Solicitar tiempo
        System.out.print("Ingrese el tiempo (en segundos): ");
        double tiempo = teclado.nextDouble();

        // Calcular la distancia
        double distancia = velocidad * tiempo;

        // Mostrar el resultado
        System.out.println("La distancia recorrida es: " + distancia + " metros");
    }
}
