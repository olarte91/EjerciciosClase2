public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Ejercicio 5: ¿Cuánto te ha costado el ordenador?
         * El videojuego en el ordenador está viviendo una nueva época de oro con un
         * montón de juegos exclusivos. Para comprarte un PC Gamer deberás fijarte
         * principalmente en el procesador, la tarjeta gráfica, la memoria RAM... pero
         * sobre todo en los accesorios como el teclado y ratón.
         * 
         * Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta
         * 660€ con todos los accesorios incluidos. Sin embargo, el vendedor te
         * descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por el
         * ordenador con todos los accesorios?
         */

         var precioOrdenador = 660.0;
         var descuento = 10.0;
         System.out.printf("Se debe pagar: $%.2f", precioOrdenador - (precioOrdenador * descuento / 100));
    }
}
