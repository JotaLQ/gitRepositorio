// 5. Elaborar una planilla de sueldo semanal de una persona particular que dispone
// de la siguiente información. Se sabe el numero de horas que trabajo y el costo de
// hora que acordaron. Presentar cuanto se debe pagar a la persona. 



import java.util.Scanner;

public class planillaSueldo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Solicitar el número de horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = teclado.nextInt();

        // Solicitar el costo por hora
        System.out.print("Ingrese el costo por hora: ");
        double costoPorHora = teclado.nextDouble();

        // Calcular el sueldo total
        double sueldoTotal = horasTrabajadas * costoPorHora;

        // Mostrar el resultado
        System.out.printf("El total a pagar es: $%.2f%n", sueldoTotal);

        // Cerrar el escáner
        teclado.close();
    }
}

