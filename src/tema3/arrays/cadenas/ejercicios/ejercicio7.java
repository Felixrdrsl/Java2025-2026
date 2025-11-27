package tema3.arrays.cadenas.ejercicios;

public class ejercicio7 {


    public static void main(String[] args) {


        /**
         * Diseña un programa en Java que solicite al usuario una cadena
         * en la que buscará y otra que será la cadena buscada. El programa
         * indicará cuántas veces aparece la segunda cadena en la primera.
         *
         * cadena = "El día de hoy es el más largo de mi vida."
         * subcadena = "de"
         * contador = 2
         *
         * indexOf
         *
         */

        String cadena = "El día de hoy es el más largo de mi vida.";
        String subcadena = "de";
        int contador = 0;
        int fromIndex = 0;

        while (fromIndex != -1){
            fromIndex = cadena.indexOf(subcadena,fromIndex+1);
            if (fromIndex != -1){
                contador++;
            }
        }

        System.out.println(contador);







    }
}
