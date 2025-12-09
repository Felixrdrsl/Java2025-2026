package tema3.arrays.cadenas.ejercicios;

public class ejercicio11 {
    public static void main(String[] args) {


        /**
         * Crea un programa que reciba una cadena de caracteres y la devuelva
         * invertida con efecto espejo. Se concatena a la palabra original su
         * inversa, compartiendo la última letra, que hará de espejo.
         * Por ejemplo, al introducir "teclado" devolverá "tecladodalcet".
         * Haz dos versiones,
         * una con String y otra con StringBuffer.
         */


        String cadena = "teclado";

        //Versión StringBuffer
        StringBuffer cadenaInvertida = new StringBuffer(cadena);
        StringBuffer resultado = new StringBuffer();
        //System.out.println(cadenaInvertida.reverse());

        resultado.append(cadenaInvertida)
                .append(cadenaInvertida.reverse().substring(1));

        System.out.println(resultado);

        //Versión con String
        String resuStr = cadena;

        //0123456
        //teclado
        for(int i=cadena.length()-2; i >= 0; i--) {
            resuStr += cadena.charAt(i);
        }
        System.out.println(resuStr);

    }
}
