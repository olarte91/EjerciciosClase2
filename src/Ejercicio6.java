public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * Ejercicio 6: ¿Qué precio tenían antes del descuento?
         * En España, las rebajas de invierno suelen comenzar entre los días 1 y 7 de
         * enero y finalizan a final de marzo. Por otro lado, las rebajas de verano
         * empiezan durante la primera semana del mes de julio y finalizan durante el
         * mes de septiembre.
         * 
         * Para aprovechar la temporada de rebajas he salido de compras. He pagado 34€
         * por unos pantalones que tenían un descuento del 15%. ¿Qué precio tenían antes
         * de aplicar el descuento?
         */

         var valorPantalones = 34.0;
         var descuento = 0.85;
         System.out.printf("El precio antes del descuento era: $%.2f", valorPantalones/descuento);
    }
}
