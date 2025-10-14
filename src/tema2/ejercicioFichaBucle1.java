package tema2;

import java.util.Scanner;

public class ejercicioFichaBucle1 {
    public static void main(String[] args) {

        //Adivinar un numero generado por el pc entre (1-100)
        //pedir por teclado un numero del 1 al 1000, y el programa
        //nos responde si el numero es igual (fin), mayor o menor que el numero generado a acertar


        int numeroAAdivinar = (int) (Math.random() * 100) + 1;
        int numero;
        int intentos = 7;
        System.out.println("Tienes 7 intentos");
        do {
            System.out.println("Dime un numero");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
            if (numero > numeroAAdivinar){
                System.out.println("EL numero es menor");
            }else if (numero< numeroAAdivinar){
                System.out.println("El numero es mayor");
            }else System.out.println("Has acertado el numero");
            intentos--;
            if (intentos == 0){
                System.out.println("Te has quedado sin intentos");
                break;
            }else {
                System.out.println("Intentos restantes " + intentos );

            }

        }while (numero!=numeroAAdivinar);






    }
}
