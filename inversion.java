/*
 * 11. Tres personas deciden invertir su dinero para fundar una empresa. Cada una de
    ellas invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte
    con respecto a la cantidad total invertida. 
 */

import java.util.Scanner;

public class inversion {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la inversión de cada persona
        System.out.print("Ingrese la cantidad invertida por la persona 1: ");
        double inversion1 = scanner.nextDouble();

        System.out.print("Ingrese la cantidad invertida por la persona 2: ");
        double inversion2 = scanner.nextDouble();

        System.out.print("Ingrese la cantidad invertida por la persona 3: ");
        double inversion3 = scanner.nextDouble();

        // Calcular el total de inversiones
        double total = inversion1 + inversion2 + inversion3;

        // Calcular el porcentaje de cada inversión
        double porcentaje1 = (inversion1 / total) * 100;
        double porcentaje2 = (inversion2 / total) * 100;
        double porcentaje3 = (inversion3 / total) * 100;

        // Mostrar los resultados
        System.out.printf("La persona 1 invierte el %.2f%% del total.\n", porcentaje1);
        System.out.printf("La persona 2 invierte el %.2f%% del total.\n", porcentaje2);
        System.out.printf("La persona 3 invierte el %.2f%% del total.\n", porcentaje3);

        // Cerrar el escáner
        scanner.close();
    }
}
