package tema2;

import java.util.Scanner;

public class EjercicioFicha2 {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        numero1 = scanner.nextInt();
        System.out.println("Dime el segundo numero");
        numero2 = scanner.nextInt();

        while (numero1 <= numero2) {
            if (numero1 % 2 == 0) {
                System.out.println(numero1);
            }
            numero1++;
        }
    }
}