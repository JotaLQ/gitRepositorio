/*
 * 13. Leer un angulo entre 0 y 180°. Y determinar su nombre si es menor de 90°
    corresponde a un angulo agudo, si es mayor de 90° corresponde a un angulo
    obtuso y es 90° corresponde a un angulo recto
 */

import java.util.Scanner;

public class angulo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un ángulo entre 0 y 180°: ");
        double angulo = scanner.nextDouble();
        
        if (angulo < 0 || angulo > 180) {
            System.out.println("El ángulo debe estar entre 0 y 180°.");
        } else if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else {
            System.out.println("El ángulo es obtuso.");
        }

        scanner.close();
    }
}
