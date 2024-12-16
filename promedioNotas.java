// 3. Se necesita obtener el promedio simple de un estudiante a partir de tres notas
// parciales

import java.util.Scanner;

public class promedioNotas {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = teclado.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.printf("El promedio de las notas es: %.2f\n", promedio);

    }
}
