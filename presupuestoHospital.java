/* 9. En un hospital existen tres áreas: Ginecobstetricia, Pediatría y Traumatología. El
   presupuesto anual del hospital se reparte conforme a la siguiente tabla:
   Obtener la cantidad de dinero que recibirá cada área, para cualquier monto
   presupuestal. 
*/

import java.util.Scanner;

public class presupuestoHospital {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Porcentajes asignados a cada área
        final double ginecobstetricia = 0.40;
        final double traumatologia = 0.30;
        final double pediatria = 0.30;

        // Crear un objeto Scanner para recibir input del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el monto presupuestal al usuario
        System.out.print("Ingrese el monto presupuestal: ");
        double montoPresupuestal = scanner.nextDouble();

        // Calcular el presupuesto para cada área
        double presupuestoGinecobstetricia = montoPresupuestal * ginecobstetricia;
        double presupuestoTraumatologia = montoPresupuestal * traumatologia;
        double presupuestoPediatria = montoPresupuestal * pediatria;

        // Mostrar los resultados
        System.out.printf("Presupuesto para Ginecobstetricia: %.2f\n", presupuestoGinecobstetricia);
        System.out.printf("Presupuesto para Traumatología: %.2f\n", presupuestoTraumatologia);
        System.out.printf("Presupuesto para Pediatría: %.2f\n", presupuestoPediatria);
        
        // Cerrar el scanner
        scanner.close();
    }
}
