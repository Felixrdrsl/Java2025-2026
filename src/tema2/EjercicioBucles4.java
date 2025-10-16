package tema2;

import java.util.Enumeration;
import java.util.Scanner;

public class EjercicioBucles4 {
    public static void main(String[] args) {

        //Pide 10 palabras por teclado y dime cuantas de ellas
        //Tienen longitud mayor de 5 caracteres
        //cadena.length() devuelve la longitud de la cedena

        int contador = 1;
        String palabra;

        while (contador <=10){
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime una palabra " + contador);
            palabra = sc.nextLine();
            System.out.println(palabra + " -> " + palabra.length());
            contador++;
            if (contador == 11){
                break;
            }

        }




    }
}
