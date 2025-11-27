package tema3.arrays.cadenas.ejercicios;

public class ejercicio4 {





    public static void main(String[] args) {


        /**
         * Elimina los espacios (intermedios tambien) de una cadena de texto.
         */

        String texto = "       Esto es   un texto    con espacios,    muchos.";
        System.out.println(texto + ".");

        //usar trim para liminar los espacios del principio y del final
        texto = texto.trim();

        System.out.println(texto + ".");

        //quitar espacios intermedios
        //sustituir cualquier combinacion de espacios por un solo espacio
        texto = texto.replaceAll(" +", " ");
        System.out.println(texto);





    }
}
