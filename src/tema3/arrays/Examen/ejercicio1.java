package tema3.arrays.Examen;

import java.util.Scanner;

public class ejercicio1 {
    /**
     * 1.1 Método encriptar (1.75 puntos)
     * Recibe un texto y lo convierte según estas transformaciones, aplicándose en este orden:
     * Cambia todas las consonantes por su siguiente letra en el abecedario (z pasa a b).
     * Las vocales a, e, i, o, u pasan a mayúsculas.
     * Invierte el orden de las letras en cada palabra individual.
     * Por ejemplo:
     * Entrada: hola mundo
     * Salida: Alpm Ovnpe
     *
     * 1.2 Método desencriptar (1.25 puntos)
     * Recibe un texto encriptado y realiza el proceso inverso para recuperar el texto original:
     * Invierte el orden de las letras en cada palabra.
     * Las vocales mayúsculas A, E, I, O, U pasan a minúsculas.
     * Cambia cada consonante por su letra anterior en el abecedario (b pasa a z).
     * Por ejemplo:
     * Entrada: Alpm Ovnpe
     * Salida: hola mundo
     *
     * Indicaciones:
     * No se pueden usar estructuras dinámicas como ArrayList.
     * Usa preferentemente char[] o StringBuilder .
     * Debes implementar ambos métodos: String encriptar(String texto) y String
     * desencriptar(String texto) .
     * Programa principal debe demostrar que encriptar y luego desencriptar devuelve el texto
     * original.
     */

    //Metodo que invierte las palabras una por una
    public static String invertirPalabras(String texto) {
        String[] palabras = texto.split(" ");
        StringBuilder aux = new StringBuilder();
        for(int i=0; i < palabras.length; i++) {
            aux = new StringBuilder(palabras[i]);
            aux.reverse();
            palabras[i] = aux.toString();

        }

        //Unir palabras en una frase separado por espacios
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < palabras.length; i++) {
            sb.append(palabras[i] + " ");
        }
        return sb.toString().trim();
    }
    //Aqui las vocales las cambia a mayusculas
    public static String reemplazoVocales(String texto) {
        StringBuffer sb = new StringBuffer(texto);
        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a': sb.setCharAt(i, 'A'); break;
                case 'e': sb.setCharAt(i, 'E'); break;
                case 'i': sb.setCharAt(i, 'I'); break;
                case 'o': sb.setCharAt(i, 'O'); break;
                case 'u': sb.setCharAt(i, 'U'); break;
            }
        }

        return sb.toString();
    }

    //Metodo donde encripta la frase llamando a los otros metodos
    public static String encriptar(String texto) {
        String textoEnc = texto;
        textoEnc = encriptarConsonantes(textoEnc);
        textoEnc = reemplazoVocales(textoEnc);
        textoEnc = invertirPalabras(textoEnc);
        return textoEnc;
    }
    //Metodo que desencripta la frase
    public static String desencriptar(String texto) {
        String textoDes = texto;
        textoDes = invertirPalabras(textoDes);
        textoDes = textoDes.toLowerCase();
        textoDes = desencriptarConsonantes(textoDes);
        return textoDes;
    }

    public static String desencriptarConsonantes(String texto){
        StringBuilder sb =new StringBuilder();
        int clave = 1;
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            int codigo =c;         // Convertir a ASCII
            if (codigo == 'a' || codigo== 'e' || codigo== 'i'
                    || codigo== 'o' || codigo== 'u' || codigo == ' '){
                codigo+= 0;

            }else if (codigo == 'b' || codigo == 'f' || codigo == 'j'
                    || codigo == 'p' || codigo == 'v'){
                codigo -= 2;            // Sumar clave
            }else {
                codigo -= clave;       // Sumar clave
            }

            sb.append((char) codigo);
        }
        return sb.toString();
    }

    // Cambia las consonantes
    public static String encriptarConsonantes(String texto){
        StringBuilder sb =new StringBuilder();
        int clave = 1;
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            int codigo =c;         // Convertir a ASCII
            if (codigo == 'a' || codigo== 'e' || codigo== 'i'
                    || codigo== 'o' || codigo== 'u' || codigo == ' '){
                codigo+= 0;

            }else if (codigo == 'z' || codigo == 'd' || codigo == 'h'
                    || codigo == 'n' || codigo == 't'){
                codigo += 2;            // Sumar clave
            }else {
                codigo += clave;       // Sumar clave
            }
            sb.append((char) codigo);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String texto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme una frase cualquiera: ");
        texto = sc.nextLine();
        System.out.println("El texto encriptado sería: ");
        System.out.println(texto=encriptar(texto));
        System.out.println("El texto desencriptado sería: ");
        String descifrar = desencriptar(texto);
        System.out.println(descifrar);




    }




}
