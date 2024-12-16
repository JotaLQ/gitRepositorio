/*
 * 14. Un triángulo es equilátero si todos sus lados son iguales; isósceles, si solo tiene
    dos lados iguales, y en caso contrario, escaleno. Escriba un algoritmo que dado
    las longitudes de los lados de un triángulo determine si es equilátero, isósceles o
    escaleno.   
 */


import javax.swing.JOptionPane;

public class JOPtriangulo {
    public static void main(String[] args) {

        System.out.print("");
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la longitud del primer lado: ")); 
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la longitud del segundo lado: "));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la longitud del tercer lado: "));

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            JOptionPane.showMessageDialog(null, "Las longitudes deben ser mayores que cero.");
        } else if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es isósceles.");
        } else {
            JOptionPane.showMessageDialog(null,"El triángulo es escaleno.");
        }

    }
}
