package tema1;

import java.util.Scanner;

public class EjercicioClasePracticas7 {
    public static void main(String[] args) {

        double compraT;
        double Precio;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el precio de tu compra: ");
        compraT = sc.nextDouble();

        Precio = compraT * 0.85;
        System.out.println("El precio total es " + Precio);



    }
}
