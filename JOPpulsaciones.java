// 8. Calcular el numero de pulsaciones que una persona debe tener por cada 10
// segundos de ejercicio, si la fórmula es: número de pulsaciones : (220 - edad) /10 

import javax.swing.JOptionPane;

public class JOPpulsaciones {
    public static void main(String[] args) {
        
        int edad; 
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu edad: "));

        int pulsaciones = (220 - edad) / 10;

        JOptionPane.showMessageDialog(null, "Número de pulsaciones por cada 10 segundos de ejercicio: " + pulsaciones);

    }
}
