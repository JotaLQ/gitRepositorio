import java.util.Random;
import javax.swing.JOptionPane;

public class JuegoAdivina {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;

        int intentosRestantes = 3;

        JOptionPane.showMessageDialog(null, "¡Bienvenido al juego de Adivina el Número!\nHe generado un número entre 1 y 10. Tienes " + intentosRestantes + " intentos para adivinarlo.");

        int intentos = 0;
        boolean adivinado = false;

        while (intentos < intentosRestantes) {
            String input = JOptionPane.showInputDialog(null, "Intento " + (intentos + 1) + ": Ingresa tu número (1-10):");
            int intento = Integer.parseInt(input); 
            intentos++;

            if (intento == numeroSecreto) {
                adivinado = true;
                break;
            } else {
                if (intento < numeroSecreto) {
                    JOptionPane.showMessageDialog(null, "El número es mayor. ¡Sigue intentándolo!");
                } else {
                    JOptionPane.showMessageDialog(null, "El número es menor. ¡Sigue intentándolo!");
                }
            }
        }

        if (adivinado) {
            JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
        }
    }
}
