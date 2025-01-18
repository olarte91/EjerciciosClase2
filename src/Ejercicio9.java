import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
         * Ejercicio 9: Conversión de Temperaturas
         * Escribe un programa que convierta una temperatura dada en grados Celsius a
         * grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:
         * 
         * Fahrenheit = Celsius * 9/5 + 32
         * Kelvin = Celsius + 273.15
         */

         var scanner = new Scanner(System.in);

         var temp = 0.0;

         System.out.println("Ingrese la temperatura en grados celsius: ");
         temp = scanner.nextDouble();

         System.out.printf("La tempreratura en Farenheit es : %.0f°\n", temp * 9/5 + 32);
         System.out.printf("La temperatura en Kelvin es: %.2f\n", temp + 273.15);
         scanner.close();
    }
}
