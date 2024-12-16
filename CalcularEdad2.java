import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class CalcularEdad2 {
    public static void main(String[] args) {

        int añoNacimiento = 0;
        int mesNacimiento = 0;
        int diaNacimiento = 0;
        boolean datosCorrectos = false;

        while (!datosCorrectos) {
            try {
                añoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu año de nacimiento (YYYY):"));
                mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu mes de nacimiento (1-12):"));
                diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu día de nacimiento (1-31):"));
                
                @SuppressWarnings("unused")
                LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
                
                datosCorrectos = true;

            } catch (DateTimeException e) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. Por favor, ingresa una fecha válida.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
            }
        }
        
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        JOptionPane.showMessageDialog(null, "Tu edad es: " + periodo.getYears() + " años, " 
            + periodo.getMonths() + " meses y " + periodo.getDays() + " días.");
    }
}
