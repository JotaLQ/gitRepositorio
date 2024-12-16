import java.util.Random;
import java.util.Scanner;

public class juego_adivina {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;

        int intentosRestantes = 3;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He generado un número entre 1 y 10. Tienes " + intentosRestantes + " intentos para adivinarlo.");
        
        int intentos = 0;
        boolean adivinado = false;
        
        while (intentos < intentosRestantes) {
            System.out.print("Intento " + (intentos + 1) + ": Ingresa tu número (1-10): ");
            int intento = scanner.nextInt();
            intentos++;
            
            if (intento == numeroSecreto) {
                adivinado = true;
                break;
            } else {

                if (intento < numeroSecreto) {
                    System.out.println("El número es mayor. ¡Sigue intentándolo!");
                } else {
                    System.out.println("El número es menor. ¡Sigue intentándolo!");
                }
            }
        }
        

        if (adivinado) {
            System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
        } else {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
        }
        

        scanner.close();
    }
}
