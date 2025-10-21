package tema2;

import java.util.Scanner;

public class BulceAcumulador {
    public static void main(String[] args) {

        //Pide 5 numeros por teclado y guarda una variable la suma de los que sean impares

        int numero;
        int sumaImpares = 0;
        Scanner sc = new Scanner(System.in);


        for (int i=0; i<5; i++){

            System.out.println("Dime un numero");
            numero = sc.nextInt();
            if (numero % 2 == 1){
                sumaImpares = sumaImpares + numero; //Tambien se podria poner (sumaImpares += numero)
            }


        }
        System.out.println("La suma de los impares es: " + sumaImpares);


    }
}
