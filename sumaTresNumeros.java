// 1. Suma de tres números. 


import java.util.Scanner;

public class sumaTresNumeros {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = teclado.nextInt();

        int suma = numero1 + numero2 + numero3;

        System.out.println("La suma de los tres números es: " + suma);
        
    }
}
