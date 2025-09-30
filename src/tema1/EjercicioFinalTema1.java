package tema1;

import java.util.Scanner;

public class EjercicioFinalTema1 {
    public static void main(String[] args) {

        //Dado los catetros de un triangulo calcaular su hipotenusa y mostrarla

        double Cateto1;
        double Cateto2;
        double Hipotenusa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer cateto");
        Cateto1 = sc.nextDouble();
        System.out.println("Dime el segundo cateto");
        Cateto2 = sc.nextDouble();

        Hipotenusa = Math.sqrt(Math.pow(Cateto1,2) + Math.pow(Cateto2,2));

        System.out.println("Su hipotenusa es: " + Hipotenusa);



    }
}
