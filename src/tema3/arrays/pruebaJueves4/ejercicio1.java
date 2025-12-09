package tema3.arrays.pruebaJueves4;

import java.util.Scanner;

public class ejercicio1 {

    /**Realiza una función que reciba como parámetro una cadena de texto y devuelva esa cadena con
     las vocales cifradas según el siguiente patrón:
     Vocal Sustituto
     a/A       4
     e/E       3
     i/I       1
     o/O       0
     u/U       9
     Además, debe invertir el orden de cada palabra (pero no el orden de las palabras en la frase).
     Ejemplo:
     Entrada: Hola mundo
     Transformación 1: H0l4 m9nd0
     Salida final: 4l0H 0dn9m
     Restricciones:
     No se pueden usar métodos replace , replaceAll de String ni StringBuffer .
     Se recomienda usar una estructura mutable ( StringBuilder o similar) para hacer las
     transformaciones de manera eficiente.
     Ejemplo adicional:
     Entrada: Buenos dias Eva
     Salida esperada: s0n39B s41d 4v3
     */

    //Metodo que cambia las vocales por numeros

    public static String reemplazoVocales(String texto) {
        StringBuffer sb = new StringBuffer(texto);
        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a': sb.setCharAt(i, '4'); break;
                case 'e': sb.setCharAt(i, '3'); break;
                case 'i': sb.setCharAt(i, '1'); break;
                case 'o': sb.setCharAt(i, '0'); break;
                case 'u': sb.setCharAt(i, '9'); break;
                case 'A': sb.setCharAt(i, '4'); break;
                case 'E': sb.setCharAt(i, '3'); break;
                case 'I': sb.setCharAt(i, '1'); break;
                case 'O': sb.setCharAt(i, '0'); break;
                case 'U': sb.setCharAt(i, '9'); break;
            }
        }

        return sb.toString();
    }


    //Metodo que invierte las palabras una por una
    public static String invertirPalabras(String texto) {
        String[] palabras = texto.split(" ");
        StringBuffer aux = new StringBuffer();
        for(int i=0; i < palabras.length; i++) {
            aux = new StringBuffer(palabras[i]);
            aux.reverse();
            palabras[i] = aux.toString();

        }

        //Unir palabras en una frase separado por espacios
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < palabras.length; i++) {
            sb.append(palabras[i] + " ");
        }
        return sb.toString().trim();
    }

    //Metodo donde encripta la frase llamando a los otros metodos
    public static String encriptar(String texto) {
        String textoEnc = texto;
        textoEnc = reemplazoVocales(textoEnc);
        textoEnc = invertirPalabras(textoEnc);
        return textoEnc;
    }

    public static void main(String[] args) {
        String texto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme una frase cualquiera: ");
        texto = sc.nextLine();
        System.out.println(texto=encriptar(texto));



    }


}
