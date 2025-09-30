package tema1;

import java.util.Scanner;

public class EjercicioFinalTema3 {
    public static void main(String[] args) {

        //Lee de teclado dos valores de tipo double num1, num2
        //Intercambia el valor de las variables y pintalo por pantalla


        double numero1, numero2;
        double temp;


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        numero1 = sc.nextDouble();
        System.out.println("Dime el segundo numero");
        numero2 = sc.nextDouble();

        temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("Numero 1 " + numero1);
        System.out.println("Numero 2 " + numero2);




    }
}
