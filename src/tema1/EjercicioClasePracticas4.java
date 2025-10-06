package tema1;

import java.util.Scanner;

public class EjercicioClasePracticas4 {
    public static void main(String[] args) {

        double temperaturaF;
        double temperaturaC;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la temperatura en Farenheit: ");

        temperaturaF = sc.nextDouble();

        temperaturaC = (temperaturaF - 32) * 5/9;

        System.out.println("La temperatura en C es: " + temperaturaC);



    }
}
