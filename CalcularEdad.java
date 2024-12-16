import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class CalcularEdad {
    public static void main(String[] args) {

        int añoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu año de nacimiento (YYYY):"));
        
        int mesNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu mes de nacimiento (1-12):"));
        
        int diaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu día de nacimiento (1-31):"));
        
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        JOptionPane.showMessageDialog(null, "Tu edad es: " + periodo.getYears() + " años, " 
            + periodo.getMonths() + " meses y " + periodo.getDays() + " días.");
    }
}