import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        /*
         * Ejercicio 8: Área y Perímetro de un Rectángulo
         * Crea un programa que calcule el área y el perímetro de un rectángulo.
         * Solicita al usuario la longitud y el ancho del rectángulo.
         */
        var scanner = new Scanner(System.in);

         var longitud = 0;
         var ancho = 0;
         System.out.println( "Ingrese la longitud del rectángulo: ");
         longitud = scanner.nextInt();
         System.out.println("Ingrese el ancho del rectángulo: ");
         ancho = scanner.nextInt();

         System.out.printf("El área del rectángulo es: %d cm2\n", longitud * ancho);
         System.out.printf("El perímetro del rectángulo es: %d cm\n", 2 * (longitud + ancho));

         scanner.close();
    }
}
