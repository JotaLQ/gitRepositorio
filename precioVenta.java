/*
 * 10. El dueño de una tienda compra un artículo a un precio determinada Obtener el
       precio a que lo debe vender para obtener una ganancia del 30% por ciento
 */

import java.util.Scanner;

public class precioVenta {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el costo del artículo
        System.out.print("Ingrese el costo del artículo: ");
        double costo = scanner.nextDouble();

        // Calcular el precio de venta para obtener una ganancia del 30%
        double gananciaPorcentaje = 0.30;
        double precioVenta = costo + (costo * gananciaPorcentaje);

        // Mostrar el resultado
        System.out.printf("El precio de venta para obtener una ganancia del 30%% es: %.2f\n", precioVenta);

        // Cerrar el scanner
        scanner.close();
    }
}
