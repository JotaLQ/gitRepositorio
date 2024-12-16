import java.util.Scanner;

public class tablamulti {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        int num, resultado;
        int i;
        System.out.println("Numero de tabla (Multiplicar): ");
        num = teclado.nextInt();
        for (i = 1; i <= 12; i++) {
            resultado = num * i;
            System.out.println(+num+" x "+i+" = "+resultado);
            
        }
        
    }
}
