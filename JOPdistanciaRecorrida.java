/* 
 * Ejercicio 2
*/
import javax.swing.JOptionPane;

public class JOPdistanciaRecorrida {
    public static void main(String[] args) { 

        double velocidad;
        velocidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la velocidad (en m/s): "));
        double tiempo;
        tiempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tiempo (en segundos): "));
        double distancia = velocidad * tiempo;
        JOptionPane.showMessageDialog(null, "La distancia recorrida es: " + distancia + " metros");
    }
}
