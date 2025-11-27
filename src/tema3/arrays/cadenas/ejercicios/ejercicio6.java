package tema3.arrays.cadenas.ejercicios;

public class ejercicio6 {


    public static void main(String[] args) {

        /**
         * Diseña un programa en Java que solicite al usuario una cadena de
         * caracteres y muestre por pantalla un conteo de cuántas vocales,
         * consonantes y espacios en blanco contiene la cadena introducida.
         */


        String cadena = "Javi tengo la cabeza loca ya, para por Dios";
        int contadorVocales = 0, contadorConsonantes = 0, contadorEspacios = 0;


        for (int i = 0; i<cadena.length();i++){
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' ||
                    cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u'){
                contadorVocales++;
            } else if (cadena.charAt(i) ==' ') {
                contadorEspacios++;
            } else if (cadena.charAt(i) ==',') {
                continue;
            }else {
                contadorConsonantes++;
            }
        }
        System.out.println("Son: " + contadorConsonantes + " Consonantes");
        System.out.println("Son: " + contadorEspacios + " Espacios");
        System.out.println("Son: " + contadorVocales + " vocales");


    }
}
