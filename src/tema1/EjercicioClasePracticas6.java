package tema1;

import java.util.Scanner;

public class EjercicioClasePracticas6 {
    public static void main(String[] args) {

        int minutos;
        int horas;
        int resto;


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cantidad en minutos :");
        minutos = sc.nextInt();

        horas = (minutos / 60);
        resto = (minutos % 60);
        System.out.println("EL total de horas son: " + horas + " y minutos: " + resto);





    }
}
