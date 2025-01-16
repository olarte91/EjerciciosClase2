import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         * Ejercicio 7: Calculadora Básica
         * Escribe un programa que solicite al usuario dos números y luego realice las
         * operaciones de suma, resta, multiplicación y división con esos números.
         * Muestra los resultados en la consola.
         */

         var scanner = new Scanner(System.in);

         System.out.println("Ingrese el primer número: ");
         var numero1 = scanner.nextInt();
         System.out.println("Ingrese el segundo número: ");
         var numero2 = scanner.nextInt();

         System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);
         System.out.printf("%d - %d = %d\n", numero1, numero2, numero1 - numero2);
         System.out.printf("%d * %d = %d\n", numero1, numero2, numero1 * numero2);
         System.out.printf("%d / %d = %d\n", numero1, numero2, numero1 / numero2);

         scanner.close();
         
    }
}
