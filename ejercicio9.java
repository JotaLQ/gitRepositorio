import javax.swing.JOptionPane;

public class ejercicio9 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Hola Mundo");
        String palabra;
        int numero;
        char letra;
        double promedio;
        palabra = JOptionPane.showInputDialog(null,"Ingrese sus nombres: ");
        System.out.println(palabra);
        JOptionPane.showMessageDialog(null,palabra);
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrse un numero: "));
        System.out.println(numero+5);
        JOptionPane.showMessageDialog(null,numero+5);
        letra = JOptionPane.showInputDialog(null, "Su letra: "+palabra).charAt(0);
        System.out.println(letra);
        promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor: "));
        System.out.println(promedio);
    }
}
