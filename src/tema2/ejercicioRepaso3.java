package tema2;

import java.util.Scanner;

public class ejercicioRepaso3 {
    public static void main(String[] args) {
        //Programa que pida un número por teclado y muestre su tabla
        //de multiplicar
        //Ejemplo: 7
        //7x1 = 7
        //7x2 = 14
        //7x3 = 21
        //7x4 = 28
        //7x5 = 35
        //7x6 = 42
        //7x7 = 49
        //7x8 = 56
        //7x9 = 63
        //7x10 = 70

        Scanner sc = new Scanner(System.in);
        long numero;
        long resultado = 1;
        System.out.println("Dime un numero");
        numero = sc.nextLong();

        for (int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + "x" + i + " = " + resultado);
            resultado = 0;
        }


    }
}
