import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2: ¿Ves algún error en el precio?
         * En el mercado, podemos encontrar que el precio del producto Pernil Iberic
         * D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor
         * nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el
         * precio?
         * 
         * En este reto tienes que hacer un programa que calcule correctamente el precio
         * por kilo del producto.
         */
        var scanner = new Scanner(System.in);
        var precioKilo = 29.75;
        var precioTotal = 0.0;

        System.out.println("Ingrese la cantidad de la porción en gramos");
        precioTotal = scanner.nextDouble() * precioKilo;
        System.out.printf("El valor a pagar es: %.2f", precioTotal);
    }
}





