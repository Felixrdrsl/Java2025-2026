package tema2;

import java.util.Scanner;

public class EjemploBucles3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long numero;
        long contador;

        System.out.println("Dime un numero entero ");
        numero = sc.nextLong();

        contador = 1;
        while (numero / 10 != 0 ){
        numero = numero / 10;

        contador++;

        }
        System.out.println("El numero tiene " + contador + " digitos");

        for (contador = 1; numero / 10 != 0; contador++){
            numero = numero / 10;
        }


    }
}
