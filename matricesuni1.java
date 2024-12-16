
import javax.swing.JOptionPane;

public class matricesuni1 {
    public static void main(String[] args) {
        int array[] = new int[4];
        int valor;
        for (int i = 0; i<4 ;i++){
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor"));
            array[i] = valor;
        }

        for (int i = 0; i < 4; i++){
            System.out.println("vector [" +i+ "] = "+array[i]);
        }

    }
}
