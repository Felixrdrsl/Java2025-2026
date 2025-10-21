package tema2;

import java.util.Scanner;

public class ejercioRepaso1 {
    public static void main(String[] args) {

        //    Crea una programa que pida un número y calcule su factorial
        //    El factorial de un número es el producto de todos los enteros
        //    entre 1 y el propio número y se representa por el número seguido
        //    de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120

        // Acumulador


        Scanner sc = new Scanner(System.in);


        long numero ;
        long resultado = 1;

        System.out.println("Dime un numero: ");
        numero = sc.nextLong();

        for (int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }
        System.out.println(resultado);

    }
}
