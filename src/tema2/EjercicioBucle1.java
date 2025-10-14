package tema2;

import java.util.Scanner;

public class EjercicioBucle1 {
    public static void main(String[] args) {

        //1. Suma los primeros 10 numeros (0,1,2,....,9)

        //2. Pide en un bluce 5 numeros por teclado y di si cada uno es par o impar

        //3. Pide por teclado cuatro notas (double) y muestra la media de ellas

        int Numero = 0;
        int suma = 0;
        while (Numero < 10){
            suma = suma + Numero;
            Numero++;

        }

        System.out.println(suma);

        //Scanner sc = new Scanner(System.in);
        int parImpar;
        int numero = 0;

        //while (numero <= 5){
            //System.out.println("Introduce numero: ");
           // parImpar = sc.nextInt();
           // if (parImpar % 2 == 0){
                System.out.println("Es par");
            //}else {
                System.out.println("Es impar");
           // }

            //numero++;
        //}

        Scanner SC = new Scanner(System.in);
        int contadorD = 0;
        double nota;
        double notaMedia = 0;

        while (contadorD < 4){
            System.out.println("Introduce la nota");
            nota = SC.nextDouble();
            notaMedia = notaMedia + nota;

            contadorD++;
        }
        System.out.println("La nota media es " + notaMedia/contadorD);


    }
}
