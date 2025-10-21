package tema2;

import java.util.Scanner;

public class repaso2Ficha {
    public static void main(String[] args) {

        // Realizar un algoritmo que pida números (se pedirá por teclado la
        // cantidad de números a introducir). El programa debe informar de
        // cuantos números introducidos son mayores que 0,
        // menores que 0 e iguales a 0


        int numero;
        int numero2;
        int contador1 = 0, contador2 = 0, contador3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a introducir");
        numero = sc.nextInt();

        for (int i= 1; i <= numero;i++){
            System.out.println("Dime un numero");
            numero2 = sc.nextInt();

            if (numero2 > 0){
                contador1++;
            } else if (numero2 < 0) {
                contador2++;
            } else if (numero2 == 0){
                contador3++;
            }

        }

        System.out.println("Los numeros mayores de 0 son: " + contador1);
        System.out.println("Los numeros menores de 0 son: " + contador2);
        System.out.println("Los numeros iguales a 0 son: " + contador3);



    }
}
