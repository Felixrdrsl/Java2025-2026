package tema2;

import java.util.Scanner;

public class BucleIndicador1 {
    public static void main(String[] args) {

        //pde 5 numeros por teclado y dime si "alguno" de ellos es multiplo de 5

        Scanner sc = new Scanner(System.in);

        int numero;
        boolean esMultiplo = false; // variable indicadora

        for (int i = 0; i < 5; i++){
            System.out.println("Dime un numero: ");
            numero = sc.nextInt();

            if (numero % 5 ==0){
                esMultiplo = true;
            }

        }


        if (esMultiplo){ //Al menos ha entrado una vez en el if en todas las interaciones del bucle
            System.out.println("Alguno de los numeros introducidos es multiplo de 5");
        }else {  // No ha entrado al if ni una sola vez en todo el bucle
            System.out.println("No has introducido ningun numero multiplo de 5");
        }

    }
}
