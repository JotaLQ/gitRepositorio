// 7. Un vendedor recibe un sueldo base, mas un 10% extra por comisiones de sus
// ventas. El vendedor desea saber cuánto dinero obtendrá por concepto de
// comisiones por las tres ventas que realizo en el mes, y el total que recibirá en el
// mes tomando en cuenta su sueldo base y sus comisiones. 



import java.util.Scanner;

public class vendedorComisiones {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sueldo base del vendedor
        double sueldoBase = 1000.00; 

        // Entrar los montos de las tres ventas
        System.out.print("Ingresa el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();

        System.out.print("Ingresa el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();

        System.out.print("Ingresa el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();

        // Calcular el total de las ventas
        double totalVentas = venta1 + venta2 + venta3;

        // Calcular las comisiones (10% del total de ventas)
        double comisiones = totalVentas * 0.10;

        // Calcular el total a recibir
        double totalRecibir = sueldoBase + comisiones;

        // Mostrar resultados
        System.out.println("Total de comisiones: " + comisiones);
        System.out.println("Total a recibir en el mes: " + totalRecibir);

        scanner.close();
    }
}
