package tema1;

import java.util.Scanner;

public class EjercicioClasePracticas2 {
    public static void main(String[] args) {

        double base, altura;
        double perimetro, area;


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base: ");
        base = sc.nextDouble();

        System.out.println("Dime la altura: ");
        altura = sc.nextDouble();

        perimetro = 2 * base + 2* altura;
        System.out.println("El perimetro es: " + perimetro);

        area = base * altura;
        System.out.println("El area es: " + area);



    }
}
