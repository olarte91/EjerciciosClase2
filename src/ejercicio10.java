import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        /*
         * Ejercicio 10: Media Aritmética
         * Crea un programa que calcule la media aritmética de tres números introducidos
         * por el usuario.
         */

         var scanner = new Scanner(System.in);

         var numero1 = 0;
         var numero2 = 0;
         var numero3 = 0;

         System.out.println("Ingrese el primer número: ");
         numero1 = scanner.nextInt();
         System.out.println("Ingrese el segundo número: ");
         numero2 = scanner.nextInt();
         System.out.println("Ingrese el tercer número");
         numero3 = scanner.nextInt();

         System.out.printf("la media es:  %d", (numero1 + numero2 + numero3) / 3);
         scanner.close();
    }
}
