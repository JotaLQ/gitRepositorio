// 4. Elaborar un pseudocodigo que permita leer el número de partido ganados,
// empatados y perdidos de un equipo en particular. Se debe mostrar el puntaje del
// equipo teniendo en cuenta lo siguiente: por cada partido ganado son tres puntos
// y empatado un punto y perdido cero puntos. Mostar el total de puntos. 

import java.util.Scanner;

public class puntajeEquipo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        // Declarar variables
        int ganados, empatados, perdidos;
        int puntaje;

        // Leer datos
        System.out.print("Ingrese el número de partidos ganados: ");
        ganados = teclado.nextInt();

        System.out.print("Ingrese el número de partidos empatados: ");
        empatados = teclado.nextInt();

        System.out.print("Ingrese el número de partidos perdidos: ");
        perdidos = teclado.nextInt();

        // Calcular puntaje
        puntaje = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        // Mostrar puntaje
        System.out.println("El puntaje total del equipo es: " + puntaje);

    }
}
