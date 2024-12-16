import java.util.Scanner;

public class tablarestar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner (System.in);

        int num;
        int resultado;
        int i;

        System.out.println("Numero de tabla (Restar): ");
        num = teclado.nextInt();
        
        i = 0;
        while (i <= 12){
            resultado = num - i;
            System.out.println(num+ " - " +i+ " = "+resultado);
            i++;
        }
    }
}
