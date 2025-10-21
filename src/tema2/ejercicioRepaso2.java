package tema2;

import java.util.Scanner;

public class ejercicioRepaso2 {
    public static void main(String[] args) {

        //Programa que pida numeros hasta que se introduzca un 0
        //Debe imprimir la suma y la media de todos los numeros introducidos

        // 1. bucle infinito
        // 2. Ir pidiendo por teclado cada interacion un numero
        // 3. Cuando el numero sea igual a 0 --> termina el bucle (break)
        // 4. Es un acumulador guardar la suma de todos los numeros
        // 5. Un contador (i) para saber cuantos numeros pido por teclado
        // 6. Media = acumulador / contador


        Scanner sc = new Scanner(System.in);

        long numero;
        long media = 0;
        long acumulador = 0;
        int i;
        for (i = 1; true; i++){
            System.out.println("Dime un numero: ");
            numero = sc.nextLong();

            if (numero == 0){
                System.out.println("Se acaba el programa");
                --i;
                break;
            }

            acumulador = acumulador + numero;
            System.out.println(acumulador);


        }
        media = acumulador / i;
        System.out.println("La media es " + media);



    }
}
