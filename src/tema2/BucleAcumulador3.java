package tema2;

import java.util.Scanner;

public class BucleAcumulador3 {
    public static void main(String[] args) {

        //  Pide 5 precios de un producto y la entidad de cada uno de ellos
        // Precio - cantidad
        // Precio - cantidad
        // Precio - cantidad
        // Precio - cantidad
        // Precio - cantidad
        //Mostrar el precio por pantalla


        double precio, cantidad;
        double precioTotal = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Dime el precio del producto : ");
            precio = sc.nextDouble();
            System.out.println("Dime la cantidad: ");
            cantidad = sc.nextDouble();
            precioTotal = precioTotal + (precio * cantidad);

        }
        System.out.println("El precio total de la compra es: " + precioTotal);

    }
}
