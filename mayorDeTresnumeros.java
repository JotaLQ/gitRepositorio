import java.util.Scanner;
public class mayorDeTresnumeros {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        
        int n1,n2,n3;

        int mayor;

        System.out.println("Ingrese el primer numero: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = teclado.nextInt();

        mayor = n1;
    
        if (n2 > mayor) {
           mayor = n2;
        }
        if (n3 > mayor) {
           mayor = n3;
        }
        
        System.out.println("El numero mayor es: "+mayor); 


    }
        
}