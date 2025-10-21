package tema2;

import java.util.Scanner;

public class BucleIndicador2 {
    public static void main(String[] args) {

        // Pide 5 numeros de texto por teclado y dime si alguna de ellas
        // tiene una longitud mayor de 5 caracteres

        Scanner sc = new Scanner(System.in);

        String palabra;
        boolean esMayor = false;

        for (int i = 0; i < 5; i++){
            System.out.println("Dime un numero: ");
            palabra = sc.nextLine();

            if (palabra.length() > 5){
                esMayor = true;
            }
        }
        if (esMayor){
            System.out.println("Alguna de las palabras es mayor de 5 caracteres");
        } else {
            System.out.println("Ninguna palabra es mayor de 5 caracteres");
        }

    }
}
