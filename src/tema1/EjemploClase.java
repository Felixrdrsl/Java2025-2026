package tema1;

import java.util.Scanner;

public class EjemploClase {
    public static void main(String[] args) {

        //Ejercicio clase
        //tenemos que diseñar un programa que pida por teclado tres temperaturas
        //tiene que mostrar como salida de temperatura media de esas tres
        // realizar analisis, diseño y codificacion

        //Poner primero 3 variables

        double temperatura1;
        double temperatura2;
        double temperatura3;
        double temperaturaMedia;

        //Ahora tiene que leer los datos de entrada

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la primera temperatura");
        temperatura1 = sc.nextDouble();

        System.out.println("Dame la segunda temperatura");
        temperatura2 = sc.nextDouble();

        System.out.println("Dame la tercera temperatura");
        temperatura3 = sc.nextDouble();

        //Ahora hay que hacer el calculo de la media de las temperaturas

        temperaturaMedia = (temperatura1 + temperatura2 + temperatura3) / 3;

        //Muestro el resultado de la media

        System.out.println("La temperatura media es: " + temperaturaMedia);



    }
}
