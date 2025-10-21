package tema2;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class ejercicioRepaso4 {
    public static void main(String[] args) {


        //Pide un número por teclado y comprueba si es o no primo
        //Un número es primo si SOLO es divisible por 1 y por el mismo
        //Ejemplo: 19

        //Modo de hacerlo:
        //Indicador esPrimo=true
        //Bucle desde el 2 hasta el número - 1
        //Si el número es divisible por alguno de esos, esPrimo=false

        int numero;
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = sc.nextInt();

        for (int i = 2; i <= (numero - 1); i++){

            if (numero % i == 0){
                esPrimo = false;
                break;
            }
        }
        if (esPrimo){
            System.out.println("es un numero primo");
        } else {
            System.out.println("no es primo");
        }

    }
}
