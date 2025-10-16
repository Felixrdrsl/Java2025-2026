package tema2;

import java.util.Scanner;

public class EjemploFor1 {
    public static void main(String[] args) {

        //Potencias de 2 desde 10000 hasta 2

        for (int contador = 8192; contador >=  2; contador /=2){
            System.out.print(contador + " ");
        }

        System.out.println();

        for (int numero = 1; numero <= 20; numero += 2){
            if (numero == 9 || numero == 13){
                continue;
            }
            System.out.print(numero + " ");
        }

        //Cadena.equals(<lo que quieres comparar>) --> compara dos cadenas
        //sirve para el break

        Scanner sc = new Scanner(System.in);
        String palabra;
        while (true){
            System.out.println("Introduce una palabra");
            palabra = sc.nextLine();
            if (palabra.equals("fin")){
                break;
            }
            System.out.println("La palabra es: " + palabra);
        }



    }
}
