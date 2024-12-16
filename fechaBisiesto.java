/*
 * 15. Todos los años que se dividen exactamente entre 400 o que son divisibles
    exactamente entre cuatro y no son divisibles exactamente entre 100 son años
    bisiestos. Por ejemplo, en vista que 1600 es divisible exactamente entre 400, el
    año 1600 fue bisiesto. Del mismo modo, en vista que 1988 es divisible
    exactamente entre cuatro pero no entre 100, también fue bisiesto. Usando esta
    información escriba un algoritmo que acepte el año como una entrada del
    usuario, determine si el año es bisiesto y despliegue un mensaje apropiado que le
    indique al usuario si el año es bisiesto o no (Bronson & Borse, 2010).
    Leer anio
    Si(anio mod 400 =0 o (anio mod 4=0 y anio mod 100 4 0))Entonces
    Escriba “El año ”, anio, “ es bisiesto”
    Sino
    Escriba “El año ”, anio, “NO es bisiesto”
 */

import java.util.Scanner;

public class fechaBisiesto {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Leer el año del usuario
        System.out.print("Introduce un año: ");
        int anio = teclado.nextInt();
        
        // Determinar si el año es bisiesto
        if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }
        
        teclado.close();
    }
}
